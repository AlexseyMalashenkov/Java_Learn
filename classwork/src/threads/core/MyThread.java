package threads.core;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        ThreadUtils.printAboutCurrentThread();
        System.out.println("123");
    }
}