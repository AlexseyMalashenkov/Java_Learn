package enums;

public class EnumMain2 {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        System.out.println(getRusName(day));
    }

    public static String getRusName(Day day) {
        switch (day) {
            case MONDAY:
                return "Понедельник";
            case TUESDAY:
                return "Вторник";
            case WEDNESDAY:
                return "Среда";
            case THURSDAY:
                return "Четверг";
            case FRIDAY:
                return "Пятница";
            case SATURDAY:
                return "Суббота";
            case SUNDAY:
                return "Воскресенье";
            default:
                return "неизвестно";
        }
    }
}
