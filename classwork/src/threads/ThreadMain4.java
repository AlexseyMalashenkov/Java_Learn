package threads;

import threads.core.MyJobRepeatable;
import threads.core.MyThread;
import threads.core.ThreadUtils;

public class ThreadMain4 {
    public static void main(String[] args) {
        ThreadUtils.printAboutCurrentThread();

        Thread thread = new MyThread(new MyJobRepeatable());
        thread.start();
        thread.setDaemon(true);
    }
}
