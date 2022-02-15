//Early Eagar Initialization
// In Eagar class object is created when class is loaded
//Example of Eagar Initialization in Singleton Class
class eagar {  
    private static eagar obj= new eagar();
    private eagar()
    {

System.out.println("Oject got created = ");
    }
    public static eagar getInstance()
    {
        return obj;
    }
    public void printdata(String data)

    {
        System.out.println("Display Data"+data);

    }

}
public class print{
  public static void main(String[] args)
  {
    eagar d= eagar.getInstance();
    d.printdata("A");
    eagar d1= eagar.getInstance();
    d1.printdata("B");
  }
}
