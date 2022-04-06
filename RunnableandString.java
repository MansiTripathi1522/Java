public class RunnableandString implements Runnable {
public void run()
{
    System.out.println("Now the thread is running...");
}
public static void main(String[] args)
{
    Runnable r1=new RunnableandString();
    Thread obj=new Thread(r1,"Mythread");
    obj.start();
    String str=obj.getName();
    System.out.println(str);

}
    
}
