package niodemo.client;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockThread  implements Runnable{
    public static ReentrantLock reentrantLock = new ReentrantLock();
    public static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public static int i =0;

    //@Override
    public void run() {
        for ( int j =0;j<10000;j++){
            reentrantLock.lock();
            try {
                i ++;
            }finally {
                reentrantLock.unlock();
            }
        }
    }

    public static void  main(String[] agrs){
        ReentrantLockThread lockThread = new ReentrantLockThread();

        Thread t1 = new Thread(lockThread);
        Thread t2 = new Thread(lockThread);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(i);
    }
}
