package homework_8.site_loader_with_asterisk;

import homework_8.without_asterisk.SiteLoader;

public class APBLoader extends SiteLoader {
    @Override
    public double load(Currency currencyName) {
        return 0;
    }

    @Override
    protected double handle(String content, Currency currencyName) {

        return 0;
    }
}
