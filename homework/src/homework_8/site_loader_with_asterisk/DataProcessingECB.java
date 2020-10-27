package homework_8.site_loader_with_asterisk;


import homework_8.utils.WorkWithJSON;

import java.util.Map;

public class DataProcessingECB extends BankLoader {
    public String returnLatestExchange(String url, String utlToSite, String currencyDef, String currency) {
        String result = load(url, utlToSite+"?base="+currencyDef);
        WorkWithJSON workWithJSON = new WorkWithJSON();

        Map<String, String> jsonMap = workWithJSON.parse(result);
        Map<String, String> ratesMap = workWithJSON.parse(jsonMap.get("rates"));

        return currencyDef + " = "+ ratesMap.get(currency) + " " + currency + " " + jsonMap.get("date");
    }

    public String returnAllList(String url, String utlToSite, String currencyDef) {
        String result = load(url, utlToSite+"?base="+currencyDef);
        WorkWithJSON workWithJSON = new WorkWithJSON();

        Map<String, String> jsonMap = workWithJSON.parse(result);
        Map<String, String> ratesMap = workWithJSON.parse(jsonMap.get("rates"));

        return "Курс " + currencyDef + " к валютам: " + ratesMap.toString()  + " " + jsonMap.get("date");
    }

    public String returnTwoCurrencyList(String url, String utlToSite, String currencyDef, String currencyOne, String currencyTwo) {
        String result = load(url, utlToSite+"?symbols="+currencyOne+","+currencyTwo+"&base="+currencyDef);
        WorkWithJSON workWithJSON = new WorkWithJSON();

        Map<String, String> jsonMap = workWithJSON.parse(result);
        Map<String, String> ratesMap = workWithJSON.parse(jsonMap.get("rates"));

        return "Курс " + currencyDef + " к валютам: " + ratesMap.toString()  + " " + jsonMap.get("date");
    }

    public String returnHistory(String url, String utlToSite, String start, String stop) {
        String result = load(url, utlToSite+"?start_at="+start+"&end_at="+stop);
        WorkWithJSON workWithJSON = new WorkWithJSON();

        Map<String, String> jsonMap = workWithJSON.parse(result);
        Map<String, String> ratesMap = workWithJSON.parse(jsonMap.get("rates"));

        return ratesMap.toString()  + " " + jsonMap.get("date");
    }
}
