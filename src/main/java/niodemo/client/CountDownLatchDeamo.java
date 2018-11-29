package niodemo.client;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDeamo implements Runnable{
    public static CountDownLatch countDownLatch = new CountDownLatch(10);
    public static CountDownLatchDeamo instance = new CountDownLatchDeamo();
    public void run() {

            try {
                Thread.sleep(1000);
                System.out.println(System.currentTimeMillis() + "Thread Id:" + Thread.currentThread().getId());
                //countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    public static void main(String[] agrs){
//        ExecutorService exec = Executors.newCachedThreadPool();
//        for (int i =0;i<10;i++){
//            exec.submit(instance);
//        }
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(Runtime.getRuntime().availableProcessors());
        //exec.shutdown();
    }
}
