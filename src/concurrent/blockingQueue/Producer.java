package concurrent.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000L);
            queue.put("2");
            Thread.sleep(1000L);
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
