package topic_2;

public class Task_5 {
    public static void main(String[] args) {
        dateRecognition(35370717);
    }

    public static void dateRecognition(int seconds) {
        int second = 0;
        int minute = 0;
        int hour = 0;
        int day = 0;
        int weak = 0;

        if(seconds >= 604800) {
            weak = seconds / 604800;
            day = (seconds - (weak * 604800)) / 86400;
            hour = (seconds - (weak * 604800) - (day * 86400)) / 3600;
            minute = (seconds - (weak * 604800) - (day * 86400) - (hour * 3600)) / 60;
            second = (seconds - (weak * 604800) - (day * 86400) - (hour * 3600) - (minute * 60));
        } else if (seconds >= 86400) {
            day = seconds / 86400;
            hour = (seconds - (day * 86400)) / 3600;
            minute = (seconds - (day * 86400) - (hour * 3600)) / 60;
            second = (seconds - (day * 86400) - (hour * 3600) - (minute * 60));
        } else if (seconds >= 3600) {
            hour = seconds / 3600;
            minute = (seconds - (hour * 3600)) / 60;
            second = ((seconds - (hour * 3600)) - (minute * 60));
        } else if (seconds >= 60) {
            minute = seconds / 60;
            second = seconds % 60;
        } else {
            second = seconds;
        }

        System.out.println("Недель: " + weak + "\n" + "Дней: " + day + "\n" + "Часов: " + hour + "\n" + "Минут: " + minute + "\n" + "Секунд: " + second);
    }
}
