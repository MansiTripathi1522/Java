class A
{
int x;
A()
{
x=0;
System.out.println("\n Constructor of A without any argument is invoked");
}
A(int X)
{
x=X;
System.out.println("\n Constructor of A with one argument is invoked");
}
void Display_x()
{
System.out.println("\n\t x = "+ x);
}
}
class B extends A
{     
      int y ;
      B( )
      {
	super( );
	y = 0;
               System.out.println("  Constructor of B without any argument is  invoked");
      }
       
      B( int X , int Y )   
      {
    	super(X); 
    	y = Y;
    	System.out.println("  Constructor of B with two arguments is invoked");
      }
      void Display_y( )
      {	
	System.out.println("\n\t y = " + y) ;	 
      }
}
class C extends B
{
      int z ;
      C( ) 
      {
   	super( );
    	z = 0;
    	System.out.println("  Constructor of C without any argument is invoked");
      }
     C(int X, int Y, int Z)
     {
    	super(X, Y);
    	z = Z ;
    	System.out.println("  Constructor of C with three arguments is invoked") ;
      }
      void Display_z( )
      {
      System.out.println("\n\t z = " + z) ;
   }
}
class multi
{
     	public static void main(String args[])
     	{
    		C c1 = new C( );
 		c1.Display_x( );
		c1.Display_y( );
		c1.Display_z( );
    		C c2 = new C(4, 5, 6);
    		c2.Display_x( );
		c2.Display_y( );
		c2.Display_z( );
    	}
}

