package homework_8.without_asterisk;

import homework_8.utils.WorkWithJSON;

import java.util.Map;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{
    private final String rateKey = "Cur_OfficialRate";
    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        String strRate;
        int currencyIndex = content.indexOf(rateKey);
        double rate = 0;

        try{
            strRate = content.substring((currencyIndex + 18), (currencyIndex + 24));
            rate += Double.parseDouble(strRate);
        } catch (NullPointerException | NumberFormatException ex){
            System.out.println(ex.getMessage());
        }

        return rate;
    }
}