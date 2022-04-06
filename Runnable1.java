public class Runnable1 {
    public static void main(String [] args)
    {
        Runnable r=new Runnable_Interface1();
        Thread obj=new Thread(r);
        obj.start(); 
    }
}
