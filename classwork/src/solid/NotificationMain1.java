package solid;

import solid.service.notificator.BrokenNotificator;
import solid.service.notificator.ConsoleNotificator;
import solid.service.notificator.ViberNotificator;
import solid.service.notificator.core.INotificator;
import solid.service.notificator.core.TypeNotification;
import solid.service.notificator.special.MultipleNotificator;
import solid.service.notificator.special.ResendNotificator;
import solid.service.notificator.special.RetryNotificator;

public class NotificationMain1 {
    public static void main(String[] args) {
        String orderId = String.valueOf(10);
        String message = "Пришел новый заказ. НОмер заказа: " + orderId;
        String managerName = "Леша";

        if (managerName.equalsIgnoreCase("Леша")) {
            notify(new ResendNotificator(new RetryNotificator(10, BrokenNotificator.getInstance()), ViberNotificator.getInstance()), message);
        } else {
            notify(BrokenNotificator.getInstance(), message);
        }

        TypeNotification[] typeNotifications = TypeNotification.values();
        notify(new MultipleNotificator(typeNotifications), "Ваш заказ принят в обработку");
    }

    public static boolean notify(INotificator notificator, String message) {
        return notificator.notify(message);
    }
}
