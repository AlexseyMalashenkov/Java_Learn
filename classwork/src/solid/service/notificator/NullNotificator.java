package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class NullNotificator implements INotificator {

    private volatile static NullNotificator instance;

    private NullNotificator() {

    }

    @Override
    public boolean notify(String message) {
        System.out.println("Вызван Null");
        return true;
    }

    public static NullNotificator getInstance() {
        if (instance == null) {
            synchronized (NullNotificator.class) {
                if (instance == null) {
                    instance = new NullNotificator();
                }
            }
        }
        return instance;
    }
}
