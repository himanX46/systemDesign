package databasePooling;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class BlockingQueueEx {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        // Producer
        new Thread(() -> {
            try {
                queue.put(1);
                queue.put(2);
                queue.put(3); // waits (queue full)
            } catch (Exception e) {}
        }).start();
        System.out.println("start:: "+queue);
        // Consumer
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(queue.take());
                Thread.sleep(1000);
                System.out.println("end:: "+queue);
            } catch (Exception e) {}
        }).start();
    }

}
