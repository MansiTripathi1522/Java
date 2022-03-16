import multiple_class.*;
 class import_multiple_classes_in_single_package {
    public static void main(String[] args)
    {
        multiple_class.Multiple_classes_in_single_package obj= new multiple_class.Multiple_classes_in_single_package();
       int i= obj.add(23,15);
        multiple_class.multiply obj1=new multiple_class.multiply();
        int y=obj1.mul(23,11);
        multiple_class.division obj2=new multiple_class.division ();
        int z=obj2.div(10,2);
        System.out.println("Addition = "+i);
        System.out.println("Multiplication = "+y);
        System.out.println("Division = "+z);
    }
}
