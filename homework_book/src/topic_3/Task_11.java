package topic_3;

public class Task_11 {
    public static void main(String[] args) {
        timetable(0);
    }

    public static void timetable(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Сейчас понедельник. Ваши планы - днём работа, а вечером отдых");
                break;
            case 2:
                System.out.println("Сейчас вторник. Ваши планы - днём работа, а вечером отдых");
                break;
            case 3:
                System.out.println("Сейчас среда. Ваши планы - днём работа, а вечером отдых");
                break;
            case 4:
                System.out.println("Сейчас четверг. Ваши планы - днём работа, а вечером отдых");
                break;
            case 5:
                System.out.println("Сейчас пятница. Ваши планы - днём работа, а вечером отдых");
                break;
            case 6:
                System.out.println("Сейчас суббота. Ваши планы - днём отдых, а вечером работа");
                break;
            case 7:
                System.out.println("Сейчас воскресенье. Ваши планы - днём отдых, а вечером работа");
                break;
            default:
                System.out.println("Вы ввели не верный день!");
        }
    }
}
