package solid.service.notificator.special;

import solid.service.notificator.core.INotificator;

public class ResendNotificator implements INotificator {

    private final INotificator[] notificators;

    public ResendNotificator(INotificator... notificators) {
        this.notificators = notificators;
    }

    @Override
    public boolean notify(String message) {
        boolean isSent = false;
        int index = 0;

        while (!isSent && index < notificators.length) {
            isSent = notificators[index++].notify(message);
        }

        return isSent;
    }
}
