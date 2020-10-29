package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class BrokenNotificator implements INotificator {
    @Override
    public boolean notify(String message) {
        return false;
    }
}