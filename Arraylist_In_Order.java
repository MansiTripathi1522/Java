import java.util.*;
public class Arraylist_In_Order {
    public static void main(String [] args)
    {
        ArrayList<String>list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        Collections.sort(list);
        System.out.println(list);
    
    }  
}
