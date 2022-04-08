import java.util.logging.LogManager;
import java.util.logging.Logger;
public class DemoThreadWS implements Runnable {
    
public void run()
{
    LogManager obj=LogManager.getLogManager();
    Logger log=obj.getLogger(Logger.GLOBAL_LOGGER_NAME);
   // Logger Log=obj.getLogger(Logger.GLOBAL_LOGGER_NAME);
    try{
        Thread.sleep(1000);
    }catch(InterruptedException e){
        Thread.currentThread().interrupt();
        log.warning("Thread interrupted"+e);
        Log.info(WaitingState.t1.getState());
    }
}
}
