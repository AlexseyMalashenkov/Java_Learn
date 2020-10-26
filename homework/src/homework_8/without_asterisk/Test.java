package homework_8.without_asterisk;

import homework_8.utils.WorkWithFiles;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        printRates(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader){
        List<Double> listOfRates = new ArrayList<>();
        WorkWithFiles workWithFiles = new WorkWithFiles();

        listOfRates.add(loader.load(SiteLoader.Currency.EUR));
        listOfRates.add(loader.load(SiteLoader.Currency.RUB));
        listOfRates.add(loader.load(SiteLoader.Currency.USD));

        workWithFiles.saveRateToFile("homework/src/homework_8/out/Rates.txt", listOfRates);
    }
}
