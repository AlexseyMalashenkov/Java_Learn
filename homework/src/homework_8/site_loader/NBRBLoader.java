package homework_8.site_loader;

import homework_5.EasySearch;
import homework_8.utils.WorkWithJSON;

import java.util.HashMap;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

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
        EasySearch search = new EasySearch();
        WorkWithJSON parseJSON = new WorkWithJSON(content);

        HashMap<String, String> jsonMap = parseJSON.parse();
        
        System.out.println(jsonMap);
        //TODO дописываем код сюда

        return 10;
    }
}
