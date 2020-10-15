package threads;

import threads.core.MyJob;
import threads.core.ThreadUtils;

public class ThreadMain2 {
    public static void main(String[] args) {
        ThreadUtils.printAboutCurrentThread();

        Thread thread = new Thread(new MyJob());
        thread.start();
    }
}
