package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class BrokenNotificator implements INotificator {

    private volatile static BrokenNotificator instance;

    private BrokenNotificator() {

    }

    @Override
    public boolean notify(String message) {
        System.out.println("Вызван Broken");
        return false;
    }

    public static BrokenNotificator getInstance() {
        if (instance == null) {
            synchronized (BrokenNotificator.class) {
                if (instance == null) {
                    instance = new BrokenNotificator();
                }
            }
        }

        return instance;
    }
}