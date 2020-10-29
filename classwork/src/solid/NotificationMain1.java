package solid;

import solid.service.notificator.BrokenNotificator;
import solid.service.notificator.ConsoleNotificator;
import solid.service.notificator.core.INotificator;
import solid.service.notificator.core.TypeNotification;

public class NotificationMain1 {
    public static void main(String[] args) {
        String orderId = String.valueOf(10);
        String message = "Пришел новый заказ. НОмер заказа: " + orderId;
        String managerName = "Леша";

        boolean checkFirst = false;
        boolean checkSecond = false;

        if (managerName.equalsIgnoreCase("Леша")) {
            checkFirst = notify(new BrokenNotificator(), message);
        } else {
            checkSecond = notify(new BrokenNotificator(), message);
        }

        if (!checkFirst || !checkSecond) {
            notify(new ConsoleNotificator(), message);
        }

        TypeNotification[] typeNotifications = TypeNotification.values();
        for (TypeNotification typeNotification : typeNotifications) {
            typeNotification.notify("Ваш заказ принят в обработку!!");
        }
    }

    public static boolean notify(INotificator notificator, String message) {
        return notificator.notify(message);
    }
}
