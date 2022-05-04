import java.awt.*;
import java.awt.event.*;
public class ChoiceExample1 {
    ChoiceExample1()
    {
        //creating a Frame
        Frame f=new Frame();
        //Creating a choice component
        Choice c=new Choice();
        //setting the bounds of choice menu
        c.setBounds(100,100,75,75);
        //adding items to the choice menu
        c.add(" Item 1");
        c.add(" Item 2");
        c.add(" Item 3");
        c.add(" Item 4");
        c.add(" Item 5");
        c.add(" Item 6");
        //adding choice menu to frame
        f.add(c);
        //setting size,layout and visibility of frame
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()//window adapter is a abstract class and listener is a interface
        {
            public void windowClosing(WindowEvent we)
            {
                //f.dispose();
                //we can use any one between f.dispose or System.exit(0) to close the frame
                System.exit(0);
            }
        }
        );
    }
    //main method
public static void main(String args[])
{
   new ChoiceExample1();
}
}

