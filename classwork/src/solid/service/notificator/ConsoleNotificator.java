package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class ConsoleNotificator implements INotificator {

    private volatile static ConsoleNotificator instance;

    private ConsoleNotificator() {

    }

    public boolean notify(String message) {
        System.out.println("Отправляю консоль: " + message);
        return true;
    }

    public static ConsoleNotificator getInstance() {
        if (instance == null) {
            synchronized (ConsoleNotificator.class) {
                if (instance == null) {
                    instance = new ConsoleNotificator();
                }
            }
        }

        return instance;
    }
}
