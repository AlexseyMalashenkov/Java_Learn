package topic_3;

public class Task_9 {
    public static void main(String[] args) {
        nextDay(31, 13, 2020);
    }

    public static void nextDay(int day, int month, int year) {
        int dayInMonth = 0;
        boolean isCheck = true;

        if(year % 4 == 0) {
            dayInMonth = 29;
            isCheck = true;
        } else if(year % 4 != 0 && day == 29) {
            isCheck = false;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = 31;
                break;
            case 2:
                dayInMonth = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = 30;
                break;
            default :
                isCheck = false;
        }

        if(isCheck == true) {
            int nextDay = day + 1;
            int nextMonth = month;
            int nextYear = year;

            if(day + 1 > 31 && month > 12) {
                nextDay = 1;
                nextMonth++;
            } else if (day + 1 > dayInMonth) {
                nextDay = 1;
                nextMonth = 1;
                nextYear++;
            }

            System.out.println("Заданная дата: " + day + " " + month + " " + year);
            System.out.println("Новая    дата: " + nextDay + " " + nextMonth + " " + nextYear);
        } else {
            System.out.println("Введите другую дату!");
        }

    }
}
