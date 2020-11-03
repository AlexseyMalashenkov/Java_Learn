package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class EmailNotificator implements INotificator {

    private volatile static EmailNotificator instance;

    private EmailNotificator() {

    }

    public boolean notify(String message) {
        System.out.println("Отправляю email: " + message);
        return true;
    }

    public static EmailNotificator getInstance() {
        if (instance == null) {
            synchronized (EmailNotificator.class) {
                if (instance == null) {
                    instance = new EmailNotificator();
                }
            }
        }

        return instance;
    }
}
