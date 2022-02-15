public class garbage {
    public void finalize()
    {
        System.out.println("object is garbage colled");
    }
    public static void main(String[] args)
    {
        garbage s1= new garbage();
        garbage s2= new garbage();
        s1=null;
        s2=null;
        System.gc();
    }
}
