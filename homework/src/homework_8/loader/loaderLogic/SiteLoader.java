package homework_8.loader.loaderLogic;

import homework_8.loader.core.FormatRate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Реализация загрузчика сайтов
 */
public abstract class SiteLoader {

    public enum Currency{
        USD("145", "840"),
        EUR("292", "978"),
        RUB("298", "643");

        private String idNBRB;
        private String idAPB;

        Currency(String idNBRB, String idAPB) {
            this.idNBRB = idNBRB;
            this.idAPB = idAPB;
        }

        public String getIdNBRB() {
            return idNBRB;
        }

        public String getIdAPB() {
            return idAPB;
        }
    }

    /**
     * Метод для запуска загрузки курса валют
     * @param urlToSite урл по которому надо постучаться
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    protected final FormatRate load(String urlToSite, SiteLoader.Currency currencyName){

        StringBuilder content;
        boolean error;
        int retryCount = 0;
        do{
            content = new StringBuilder();
            error = false;
            try {
                // create a url object
                HttpURLConnection con = (HttpURLConnection) new URL(urlToSite).openConnection();

                con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");
                con.setConnectTimeout(50000); //set timeout to 50 seconds
                con.setReadTimeout(50000); //set timeout to 50 seconds

                try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()))){
                    String line;
                    while ((line = bufferedReader.readLine()) != null)
                    {
                        content.append(line).append("\n");
                    }
                }
            }
            catch(Exception e)
            {
                error = true;
                retryCount++;
                System.err.println("При соединении что-то пошло не так. "  + e.getMessage());
            }
        } while (error && retryCount < 5);

        if(error){
            throw new RuntimeException("Неполучилось загрузить курсы валют");
        }
        return handle(content.toString(), currencyName);
    }

    public abstract FormatRate load(Currency currencyName);

    public abstract FormatRate load(Currency currencyName, String date);

    public abstract FormatRate load(Currency currencyName, String dateFrom, String dateTo);

    /**
     * Метод который будет дёрнут после успешной загрузки сайта
     * @param content содержимое сайта
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    protected abstract FormatRate handle(String content, Currency currencyName);
}
