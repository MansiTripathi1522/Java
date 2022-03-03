class C implements Interface1,Interface2
{
    public void add()
    {
        System.out.println("This is Interface one");
    }
    public void sub()
    {
        System.out.println("This is Interface two");
    }
}
public class Two_Interface_Together {
    public static void main(String [] args )
    {
        C obj=new C();
        obj.add();
        obj.sub();
    }
}
