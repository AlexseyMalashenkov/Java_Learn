package homework_8.site_loader_with_asterisk;

import homework_8.utils.WorkWithJSON;
import homework_8.without_asterisk.SiteLoader;

import java.util.Map;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader {

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
        WorkWithJSON parseJSON = new WorkWithJSON();

        Map<String, String> jsonMap = parseJSON.parse(content);

        System.out.println(jsonMap.get("Cur_Scale") + " "
                            + jsonMap.get("Cur_Name") + " = "
                            + jsonMap.get("Cur_OfficialRate") + " Беларуских рублей "
                            + jsonMap.get("Date"));

        return Double.parseDouble(jsonMap.get("Cur_OfficialRate"));
    }
}