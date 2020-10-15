package threads;

import threads.core.MyJobRepeatableNotInf;
import threads.core.ThreadUtils;

public class ThreadMain5 {
    public static void main(String[] args) {
        ThreadUtils.printAboutCurrentThread();

        Thread thread = new Thread(new MyJobRepeatableNotInf());

        //thread.setDaemon(true);
        thread.start();
        try {
            thread.join(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Головной закончил");
    }
}