package homework_8.site_loader_with_asterisk;


public class TestJSON {
    public static void main(String[] args) {
        printRates(new DataProcessingECB());
    }
    public static void printRates(DataProcessingECB loader){
        java.awt.Toolkit.getDefaultToolkit().beep();

        System.out.println(loader.returnLatestExchange("https://api.exchangeratesapi.io/","2010-01-12", "USD", "CAD"));
        System.out.println(loader.returnAllList("https://api.exchangeratesapi.io/","2010-01-12", "EUR"));
        System.out.println(loader.returnTwoCurrencyList("https://api.exchangeratesapi.io/","2010-01-12", "EUR", "USD", "RUB"));
        System.out.println(loader.returnHistory("https://api.exchangeratesapi.io/", "history", "2018-01-01", "2018-01-03"));
    }
}