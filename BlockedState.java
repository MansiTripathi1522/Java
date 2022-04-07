import java.util.logging.LogManager;
import java.util.logging.Logger;
public class BlockedState {
    public static void main(String [] args) throws InterruptedException
    {
        Thread t1=new Thread(new DemoThreadB());
        Thread t2=new Thread(new DemoThreadB());
        LogManager obj=LogManager.getLogManager();
        Logger log=obj.getLogger(Logger.GLOBAL_LOGGER_NAME);
        t1.start();
        t2.start();
        Thread.sleep(1000);
        log.info(String.valueOf(t2.getState()));
        System.exit(0);
    }
}
