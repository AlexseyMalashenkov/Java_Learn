package homework_8.site_loader_with_asterisk;

public class TestJSON {
    public static void main(String[] args) {
        printRates(new BPSLoader());
    }
    public static void printRates(BPSLoader loader){
        System.out.println(loader.load(BPSLoader.Currency.EUR));
        System.out.println(loader.load(BPSLoader.Currency.RUB));
        System.out.println(loader.load(BPSLoader.Currency.USD));
    }
}
