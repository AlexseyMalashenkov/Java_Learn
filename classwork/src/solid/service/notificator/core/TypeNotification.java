package solid.service.notificator.core;

import solid.service.notificator.ConsoleNotificator;
import solid.service.notificator.EmailNotificator;
import solid.service.notificator.ViberNotificator;

public enum TypeNotification implements INotificator{
    EMAIL(EmailNotificator.getInstance()),
    VIBER(ViberNotificator.getInstance()),
    CONSOLE(ConsoleNotificator.getInstance());

    private final INotificator notificator;

    TypeNotification(INotificator notificator) {
        this.notificator = notificator;
    }

    public boolean notify(String message) {
        return this.notificator.notify(message);
    }
}
