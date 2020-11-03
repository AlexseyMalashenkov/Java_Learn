package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class ViberNotificator implements INotificator {

    private volatile static ViberNotificator instance;

    private ViberNotificator() {

    }

    public boolean notify(String message) {
        System.out.println("Отправляю viber: " + message);
        return true;
    }

    public static ViberNotificator getInstance() {
        if (instance == null) {
            synchronized (ViberNotificator.class) {
                if (instance == null) {
                    instance = new ViberNotificator();
                }
            }
        }
        return instance;
    }
}
