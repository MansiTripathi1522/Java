package let_me_calculate;
public class cal{
    public int add(int a,int b)
    {
        return(a+b);
    }
    public static void main(String[] args)
    {
       cal c=new cal();
        int i= c.add(6,8);
        System.out.println(i);
    }
}