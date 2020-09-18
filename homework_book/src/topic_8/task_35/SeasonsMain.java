package topic_8.task_35;

public class SeasonsMain {
    public static void main(String[] args) {
        ESeasonsYear[] types = ESeasonsYear.values();

        for (ESeasonsYear s : types) {
            System.out.println(s);
        }
    }
}
