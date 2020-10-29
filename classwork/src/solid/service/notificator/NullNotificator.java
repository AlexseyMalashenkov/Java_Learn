package solid.service.notificator;

import solid.service.notificator.core.INotificator;

public class NullNotificator implements INotificator {
    @Override
    public boolean notify(String message) {
        return true;
    }
}
