public class arr {
    int n1,n2,n3,sum;

    arr(int a,int b)
    {
n1=a;
n2=b;
    }
    arr(int a,int b,int c)
    {
    
        n1=a;
        n2=b;
        n3=c;
    }
    void sum()
    {
        sum=n1+n2+n3;
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        arr obj= new arr(2,4);
        obj.sum();
        arr obj1=new arr(2,9,8);
        obj1.sum();

    }
}
