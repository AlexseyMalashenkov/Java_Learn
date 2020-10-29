package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class ViberNotificator implements INotificator {
    public boolean notify(String message) {
        System.out.println("Отправляю viber: " + message);
        return true;
    }
}
