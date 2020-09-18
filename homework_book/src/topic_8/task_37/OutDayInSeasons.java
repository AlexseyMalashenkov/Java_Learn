package topic_8.task_37;

import topic_8.task_35.ESeasonsYear;

public class OutDayInSeasons {
    public static void main(String[] args) {
        ESeasonsYear seasonsYear = ESeasonsYear.WINTER;

        outDays(seasonsYear);
    }

    public static void outDays(ESeasonsYear seasons) {
        switch (seasons) {
            case WINTER:
            case AUTUMN:
            case SUMMER:
            case SPRING:
                System.out.println(seasons.getCountOfDays());
                break;
        }
    }
}
