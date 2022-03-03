/*This program tells you about how to extend interface the difference between
nesteed interface and interface extends is only that in nested one we call it 
by outer interface but in this one we will call the interface which inherits the outer one.
*/
interface A
{
   void funA();
}
interface B extends A
{
    void funB();
}
class c implements B
{
    public void funA()
    {
        System.out.println("This is A Function");
    }
    public void funB()
    {
        System.out.println("This is B Function");
    }
}
public class Extend_Interface 
{
    public static void main(String [] args)
    {
       c obj =new c();
       obj.funA(); 
       obj.funB(); 
    }
}
