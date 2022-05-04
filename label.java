import java.awt.*;
import java.awt.event.*;
public class label {
    label()
    {
        Frame f=new Frame();
        TextArea ta=new TextArea("Example of Textarea");
        ta.setBounds(10,30,300,300);
        f.add(ta);
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
    public static void main(String[]args)
    {
        new label();
    }
}
