class Class1
{
    int x;
    Class1()
    {
     x=0;
    System.out.println("\n Constructor of class1 without any argument is invoked");
    }
    Class1(int X)
    {
        x=X;//  Constructor with one argument
        System.out.println("\n Constructor of class1 with argument is invoked");
    }
    void Display_x()
    {
        System.out.println("\n \t x = "+x);
    }class Class2 extends Class1
    {     
          int y ;
          Class2( )  // Constructor without argument
          {
        super( );
        y = 0;
                   System.out.println("  Constructor of Class2 without any argument is  invoked");
          }
            // Constructor with two arguments
          Class2( int X ,     // Argument for constructor Class1
                     int Y )   // Argument for constructor Class2
          {
            super(X);   // Call for constructor of Class1 with one argument
            y = Y;
            System.out.println("  Constructor of Class2 with two arguments is invoked");
          }
          void Display_y( )
          {	
        System.out.println("\n\t y = " + y) ;	 
          }
    }
    class Class3 extends Class2
    {
          int z ;
          Class3( )   // Constructor without argument
          {
           super();
            z = 0;
            System.out.println("  Constructor of Class3 without any argument is invoked");
          }
         Class3(int X, int Y, int Z) // Constructor with three arguments
         {
            super(X,Y);
            z = Z ;
            System.out.println("  Constructor of Class3 with three arguments is invoked") ;
          }
          void Display_z( )
          {	
              System.out.println("\n\t z = " + z) ;	
    	 }
    }
    

public class Multilevel {
    public static void main(String[] args)
    {
        Class3 c1 = new Class3();
        c1.Display_x();
        c1.Display_y();
        c1.Display_z();
        Class3 c2 = new Class3(4,5,6);
        c2.Display_x();
        c2.Display_y();
        c2.Display_z();
        c2.Display_z();
    } 
}
