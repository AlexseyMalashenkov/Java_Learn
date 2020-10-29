package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class EmailNotificator implements INotificator {
    public boolean notify(String message) {
        System.out.println("Отправляю email: " + message);
        return true;
    }
}
