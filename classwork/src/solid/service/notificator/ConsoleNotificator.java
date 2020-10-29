package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class ConsoleNotificator implements INotificator {
    public boolean notify(String message) {
        System.out.println("Отправляю консоль: " + message);
        return true;
    }
}
