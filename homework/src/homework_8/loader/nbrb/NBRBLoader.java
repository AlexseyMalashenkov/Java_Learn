package homework_8.loader.nbrb;

import homework_8.loader.core.FormatRate;
import homework_8.loader.loaderLogic.SiteLoader;
import homework_8.utils.WorkWithJSON;

import java.util.Map;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader {
    private final String strForRate = "Cur_OfficialRate";
    private final String strForScale = "Cur_Scale";
    private final String strForDate = "Date";
    private final String strForAbbreviation = "Cur_Abbreviation";
    private final String fileName = "NBRB.txt";

    public String getFileName() {
        return this.fileName;
    }

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public FormatRate load(Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    @Override
    public FormatRate load(Currency currencyName, String date) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId() + "?ondate=" + date, currencyName);
    }

    @Override
    public FormatRate load(Currency currencyName, String dateFrom, String dateTo) {
        return load("https://www.nbrb.by/api/exrates/rates/dynamics/" + currencyName.getId() +
                                "?startDate=" + dateFrom + "&endDate=" + dateTo, currencyName);
    }

    //https://www.nbrb.by/api/exrates/rates/dynamics/145?startDate=2016-6-1&endDate=2016-6-30
    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected FormatRate handle(String content, Currency currencyName) {

        int indexRate = content.indexOf(strForRate);
        int indexDate = content.indexOf(strForDate);
        int indexScale = content.indexOf(strForScale);
        int indexAbbreviation = content.indexOf(strForAbbreviation);

        String scale = "";

        if (currencyName.getId().equals(Currency.RUB.getId())) {
            scale = content.substring(indexScale + 11, indexScale + 14);
        } else {
            scale = content.substring(indexScale + 11, indexScale + 12);
        }

        return new FormatRate(content.substring(indexRate + 18, indexRate + 24),
                                scale,
                                content.substring(indexAbbreviation + 19, indexAbbreviation + 22),
                                content.substring(indexDate + 7, indexDate + 26));
    }
}