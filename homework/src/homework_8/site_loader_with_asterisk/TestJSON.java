package homework_8.site_loader_with_asterisk;

public class TestJSON {
    public static void main(String[] args) {
        //printRates(new NBRBLoaderJSON());
        //printRates(new BPSLoader());
        printRates(new APBLoader());
    }

    public static void printRates(NBRBLoaderJSON loader){
        System.out.println(loader.load(NBRBLoaderJSON.Currency.EUR));
        System.out.println(loader.load(NBRBLoaderJSON.Currency.RUB));
        System.out.println(loader.load(NBRBLoaderJSON.Currency.USD));
    }
    public static void printRates(BPSLoader loader){
        System.out.println(loader.load(BPSLoader.Currency.EUR));
        System.out.println(loader.load(BPSLoader.Currency.RUB));
        System.out.println(loader.load(BPSLoader.Currency.USD));
    }
    public static void printRates(APBLoader loader){
        System.out.println(loader.load(APBLoader.Currency.EUR));
        System.out.println(loader.load(APBLoader.Currency.RUB));
        System.out.println(loader.load(APBLoader.Currency.USD));
    }
}
