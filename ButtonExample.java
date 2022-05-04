import java.awt.*;
public class ButtonExample
{
    public static void main(String args[])
    {
        //create instance of frame with the label
        Frame f = new Frame("Button Example");
        //create instance of button  with label
        Button b = new Button("Click Here");
        b.setBounds(50,100,80,30);
        f.add(b);
        // set size, layout and visibilty of Frame
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}