class Rectangle // Super class
{
    double length,width;
    Rectangle()
    {
        length=width=0.0;
    }
    Rectangle(double l, double w)
    {
        length=l;
        width=w;
    } 
    void Dispaly_Area()
    {    
        System.out.println("The Area of Rectangle is : "+(length*width));
        System.out.println("The Perimeter of Rectangle is : "+(length+width));
    }
}
class cuboid extends Rectangle //Sub Class
{
    double height;
    cuboid()
    {
        super();//Calls tp Default constructor of base class
        height=0.0;
    }
    cuboid(double l,double w, double h)
    {
        super(l,w);//Calls tp Parametrized constructor of base class
        height=h;
    }
    void Display_Volume()
    {
        System.out.println("The Volume of Cuboid is : "+(length*width*height)); 
    }
}
public class singlein {
     public static void main(String[] args)
     {
         cuboid c= new cuboid(25.5,20.2,5.6);
         c.Dispaly_Area();
         c.Display_Volume();
     }
}
