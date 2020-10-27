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
        String tmp = "{\"rates\":{\"CAD\":1.558,\"HKD\":9.1598,\"ISK\":165.3,\"PHP\":57.205,\"DKK\":7.4412,\"HUF\":365.02,\"CZK\":27.295,\"AUD\":1.6592,\"RON\":4.8748,\"SEK\":10.3475,\"IDR\":17390.95,\"INR\":87.5485,\"BRL\":6.6714,\"RUB\":90.2935,\"HRK\":7.578,\"JPY\":124.14,\"THB\":36.97,\"CHF\":1.0719,\"SGD\":1.6095,\"PLN\":4.5799,\"BGN\":1.9558,\"TRY\":9.5593,\"CNY\":7.9342,\"NOK\":10.9465,\"NZD\":1.7677,\"ZAR\":19.208,\"USD\":1.1819,\"MXN\":24.8705,\"ILS\":3.9965,\"GBP\":0.90755,\"KRW\":1338.31,\"MYR\":4.922},\"base\":\"EUR\",\"date\":\"2020-10-26\"}";

        Map<String, String> jsonMap = parseJSON.parse(tmp);
        Map<String, String> jsonRates = parseJSON.parse(jsonMap.get("rates"));

        return "";
    }
}
