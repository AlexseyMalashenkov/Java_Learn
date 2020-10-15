package threads;

import threads.core.MyJob;
import threads.core.MyThread;
import threads.core.ThreadUtils;

public class ThreadMain3 {
    public static void main(String[] args) {
        ThreadUtils.printAboutCurrentThread();

        Thread thread = new MyThread(new MyJob());
        thread.start();
    }
}
