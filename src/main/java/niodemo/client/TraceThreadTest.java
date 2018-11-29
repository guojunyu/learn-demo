package niodemo.client;

import java.util.concurrent.*;

public class TraceThreadTest {

    public static void main(String[] agrs){
        ThreadPoolExecutor pools = new TraceThreadPoolExecutor(0,Integer.MAX_VALUE,0L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
        for (int i =0 ;i<5;i++){
            pools.execute(new DivTask(100,i));
        }
    }
}
