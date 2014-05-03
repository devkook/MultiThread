package devkook;

import org.junit.Test;

public class SimpleThreadTest {

    @Test
    public void 쓰레드스타트() throws InterruptedException {
        Thread thread1 = new SimpleThread();
        Thread thread2 = new SimpleThread();

        //TODO 쓰레드이름 명확하게 하라
        thread1.setName("실-01");
        thread2.setName("실-02");

        thread1.start();
        thread2.start();

        Thread.sleep(1000);
    }
}