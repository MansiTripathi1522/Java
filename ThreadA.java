public class ThreadA{
public static void main(String[] args)
{
    ThreadB obj=new ThreadB();
    obj.start();
    synchronized(obj){
        try{
            System.out.println("Waiting for obj to complete");
            obj.wait();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Total is :"+obj.total);
    }
}
}
class ThreadB extends Thread{
    int total;
    public void run(){
        synchronized(this)
        {
            for(int i=0;i<100;i++)
            {
                total=+i;
            }
            notify();
        }
    }
}
