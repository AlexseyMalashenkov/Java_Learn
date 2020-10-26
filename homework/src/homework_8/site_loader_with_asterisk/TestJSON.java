package homework_8.site_loader_with_asterisk;

public class TestJSON {
    public static void main(String[] args) {
        printRates(new NBRBLoaderJSON());
    }

    public static void printRates(NBRBLoaderJSON loader){
        System.out.println(loader.load(NBRBLoaderJSON.Currency.EUR));
        System.out.println(loader.load(NBRBLoaderJSON.Currency.RUB));
        System.out.println(loader.load(NBRBLoaderJSON.Currency.USD));
    }
}
