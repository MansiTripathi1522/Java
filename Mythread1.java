public class Mythread1 extends Thread
{
    @ Override
   public void run()//We can overload the run method but when we will call start() it will internally call run() method which is non parametrized
   
       {
           System.out.println("Hii!!");
       }
       public void run(String name)
       {
        System.out.println("This is overloaded method");
       }
}
