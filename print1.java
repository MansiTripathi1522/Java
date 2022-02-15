//Lazy Initialization
class eagar {  
    private static eagar obj= null;
    private eagar()
    {

System.out.println("Oject got created");
    }
    public static eagar getInstance()
    {
        if(obj==null)
{ 
           obj= new eagar();
}
        return obj;
    }
    public void printdata(String data)

    {
        System.out.println("Display Data"+data);

    }

}
public class print1{
  public static void main(String[] args)
  {
    eagar d= eagar.getInstance();
    d.printdata("A");
    eagar d1= eagar.getInstance();
    d1.printdata("B");
  }
}
