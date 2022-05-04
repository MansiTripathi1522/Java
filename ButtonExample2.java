import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonExample2
{
    //creating instances of Frame class and Button class
    Frame fobj;
    Button button1,button2,button3;
    //instantiating using the constructor
    ButtonExample2()
    {
        fobj=new Frame("Frame to display buttons");
        button1 = new Button();
        button2 = new Button("Click here");
        button3 = new Button();
        button3.setLabel("Button 3");
        fobj.add(button1);
        fobj.add(button2);
        fobj.add(button3);
        fobj.setLayout(new FlowLayout());
        fobj.setSize(300,400);
        fobj.setVisible(true);
    }
    public static void main(String args[])
    {
        new ButtonExample2();
    }
}