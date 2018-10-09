package niodemo.server;

public class ServerMain {
    public static void main(String[] args) {
        int port = 8080;
        if ( args != null && args.length > 0){
            try {
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){
                System.out.println("exception:" + e);
            }
            new Thread(new AsyncTimeServerHandler(),"threadTest").start();
        }else{
            new Thread(new AsyncTimeServerHandler(),"threadTest1").start();
        }
    }
}
