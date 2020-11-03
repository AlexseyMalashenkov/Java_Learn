package homework_8;


import homework_8.loader.core.SiteLoader;
import homework_8.loader.nbrb.NBRBLoader;
import homework_8.utils.WorkWithFile;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //printRates(new NBRBLoader());
        logicStart();
    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }

    private static void logicStart() {
        System.out.println("Введите путь для записи файла с курсом валют. Если путь будет не корректный или пустой - будет использоваться путь по умолчанию.");
        Scanner scanner = new Scanner(System.in);
        String path = "";
        NBRBLoader loader = new NBRBLoader();
        WorkWithFile workWithFile = new WorkWithFile();

        try {
            path = scanner.nextLine();
        } catch (NoSuchElementException | IllegalStateException e) {
            System.err.println(e.getMessage());
            path = "homework/src/homework_8/out/";
        }

        System.out.println("Введите сокращение для валюты курс которой вы хотите узнать. Варианты:\n" +
                            "       RUB\n" +
                            "       EUR\n" +
                            "       USD");

        String currency = "";

        try {
            currency = scanner.nextLine();
        } catch (NoSuchElementException | IllegalStateException e) {
            System.err.println(e.getMessage() + " валюта = USD");
            currency = "USD";
        }

        switch (currency) {
            case "RUB":
                workWithFile.saveToFile(path, loader.getFileName(), loader.load(SiteLoader.Currency.RUB));
                break;
            case "EUR":
                workWithFile.saveToFile(path, loader.getFileName(), loader.load(SiteLoader.Currency.EUR));
                break;
            case "USD":
                workWithFile.saveToFile(path, loader.getFileName(), loader.load(SiteLoader.Currency.USD));
                break;
            default:
                System.out.println("Что-то пошло не так...");
        }
    }
}
