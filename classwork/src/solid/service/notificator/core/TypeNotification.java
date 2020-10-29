package solid.service.notificator.core;

import solid.service.notificator.ConsoleNotificator;
import solid.service.notificator.EmailNotificator;
import solid.service.notificator.ViberNotificator;

public enum TypeNotification implements INotificator{
    EMAIL(new EmailNotificator()),
    VIBER(new ViberNotificator()),
    CONSOLE(new ConsoleNotificator());

    private final INotificator notificator;

    TypeNotification(INotificator notificator) {
        this.notificator = notificator;
    }

    public boolean notify(String message) {
        return this.notificator.notify(message);
    }
}
