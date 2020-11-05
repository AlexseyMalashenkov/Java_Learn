package homework_8.loader.belapb;

import homework_8.loader.core.FormatRate;
import homework_8.loader.loaderLogic.SiteLoader;
import homework_8.utils.WorkWithXML;

public class ABPLoader extends SiteLoader {
    private final String strForRate = "Cur_OfficialRate";
    private final String strForScale = "Cur_Scale";
    private final String strForDate = "Date";
    private final String strForAbbreviation = "Cur_Abbreviation";
    private final String fileName = "APB.txt";

    public String getFileName() {
        return fileName;
    }

    @Override
    public FormatRate load(Currency currencyName) {
        return load("https://belapb.by/ExCardsDaily.php?" + currencyName.getIdAPB(), currencyName);
    }

    @Override
    public FormatRate load(Currency currencyName, String date) {
        return null;
    }

    @Override
    public FormatRate load(Currency currencyName, String dateFrom, String dateTo) {
        return null;
    }

    @Override
    protected FormatRate handle(String content, Currency currencyName) {
        WorkWithXML workWithXML = new WorkWithXML();

        workWithXML.parseXML("https://belapb.by/ExCardsDaily.php?ondate=11/5/2020");

        return new FormatRate("", "", "");
    }
}
