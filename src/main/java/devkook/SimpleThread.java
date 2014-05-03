package devkook;

/**
 * Created by diginori on 2014. 5. 4..
 */
public class SimpleThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("THREAD-NAME:[%s] FOR-RUN:[%d]\n", Thread.currentThread().getName(), i);
        }
    }
}