package homework_8.site_loader_with_asterisk;


public class APBLoader extends SiteLoaderJSON {
    @Override
    public String load(Currency currencyName) {
        return load("https://belapb.by/ExCardsDaily.php?" + currencyName.getId(), currencyName);
    }

    @Override
    protected String handle(String content, Currency currencyName) {

        return "";
    }
}
