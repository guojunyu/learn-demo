package niodemo.server;

import java.util.concurrent.CountDownLatch;

public class AsyncTimeServerHandler implements Runnable{

    private int port;
    CountDownLatch latch;

    public void run(){
        System.out.println("111");
    }

}
