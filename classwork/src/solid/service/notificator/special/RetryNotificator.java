package solid.service.notificator.special;

import solid.service.notificator.core.INotificator;

public class RetryNotificator implements INotificator {

    private final INotificator[] notificators;
    private final int repeat;

    public RetryNotificator(int repeat, INotificator... notificators) {
        this.repeat = repeat;
        this.notificators = notificators;
    }

    @Override
    public boolean notify(String message) {

        for (INotificator notificator : this.notificators) {
            for (int i = 0; i < repeat; i++) {
                boolean isSent = notificator.notify(message);
                if (isSent) {
                    return true;
                }
            }
        }

        return false;
    }
}
