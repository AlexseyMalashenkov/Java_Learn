package homework_8;

import homework_8.loader.belapb.ABPLoader;
import homework_8.loader.loaderLogic.SiteLoader;
import homework_8.loader.nbrb.NBRBLoader;
import homework_8.utils.WorkWithFile;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestAPB {
    public static void main(String[] args) {
        logicStart();
    }

    private static void logicStart() {
        System.out.println("Введите путь для записи файла с курсом валют. Если путь будет не корректный или пустой - будет использоваться путь по умолчанию.");
        Scanner scanner = new Scanner(System.in);
        String path = "";
        ABPLoader loader = new ABPLoader();
        WorkWithFile workWithFile = new WorkWithFile();

        try {
            path = scanner.nextLine();
        } catch (NoSuchElementException | IllegalStateException e) {
            System.err.println(e.getMessage());
            path = "homework/src/homework_8/out/";
        }

        //workWithFile.saveToFile(path, loader.getFileName(), loader.load(SiteLoader.Currency.RUB, "2018-7-6"));
        //workWithFile.saveToFile(path, loader.getFileName(), loader.load(SiteLoader.Currency.EUR, "2018-7-6"));
        workWithFile.saveToFile(path, loader.getFileName(), loader.load(SiteLoader.Currency.USD));
    }
}
