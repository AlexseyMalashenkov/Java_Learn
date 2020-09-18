package topic_8.task_36;

import topic_8.task_35.ESeasonsYear;

public class NextSeason {
    public static void main(String[] args) {
        ESeasonsYear season = ESeasonsYear.WINTER;

        outNextSeason(season);
    }

    public static void outNextSeason(ESeasonsYear seasons) {
        switch (seasons) {
            case WINTER:
                ESeasonsYear out = seasons.SPRING;
                System.out.println(out.toString());
                break;
            case SPRING:
                out = seasons.SUMMER;
                System.out.println(out.toString());
                break;
            case SUMMER:
                out = seasons.AUTUMN;
                System.out.println(out.toString());
                break;
            case AUTUMN:
                out = seasons.WINTER;
                System.out.println(out.toString());
                break;
        }
    }
}
