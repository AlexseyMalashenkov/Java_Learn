package threads.core;

import java.util.concurrent.TimeUnit;

public class MyJobRepeatable implements Runnable {

    @Override
    public void run() {
        ThreadUtils.printAboutCurrentThread();

        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println("_");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "_");
        }
    }
}
