public class Mythread2 extends Thread{
    //@Override
    public void run()
    {
    System.out.println("This method is executed by : "+Thread.currentThread().getName());
    
    }
}
