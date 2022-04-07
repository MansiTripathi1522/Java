public class SleepDemo {
    public static void main(String args[])
    {
        Mythread3 obj=new Mythread3();
        obj.start();
        while(obj.isAlive())
        {
            try{
                obj.sleep(10);
            }
            catch(InterruptedException e)
            {
                System.out.println("Sleeping thread interrupted");
            }
            System.out.println("Thread Sleep-Demo complete");
        }
    }
}
