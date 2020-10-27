package homework_8.site_loader_with_asterisk;

import homework_8.utils.WorkWithJSON;

import java.util.Map;

public class BPSLoader extends SiteLoaderJSON {
    @Override
    public String load(Currency currencyName) {
        return load("https://www.bps-sberbank.by/page/currency-exchange-cards", currencyName);
    }

    @Override
    protected String handle(String content, Currency currencyName) {
        WorkWithJSON parseJSON = new WorkWithJSON();

        Map<String, String> jsonMap = parseJSON.parse(content);

        return "";
    }
}
