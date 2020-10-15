package threads;

import threads.core.MyJobRepeatable;
import threads.core.ThreadUtils;

public class ThreadMain4 {
    public static void main(String[] args) {
        ThreadUtils.printAboutCurrentThread();

        Thread thread = new Thread(new MyJobRepeatable());
        thread.setDaemon(true);
        thread.start();
    }
}
