import java.util.logging.LogManager;
import java.util.logging.Logger;
public class WaitingState implements Runnable{
public static Thread t1;
public static void main(String[] args)
{
    t1 = new Thread(new WaitingState());
    t1.start();
}
public void run()
{
    LogManager obj=LogManager.getLogManager();
    Logger log=obj.getLogger(Logger.GLOBAL_LOGGER_NAME);
    Thread t2= new Thread(new DemoThreadWS());
    t2.start();
    try{
        t2.join();
    }
    catch(InterruptedException e){
        Thread.currentThread().interrupt();
        log.warning("Thread interupted"+e);
    }
}
}
