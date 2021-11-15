import java.lang.*;
import java.util.*;

public class Array_list_collection {
    public static void main(String args[])
    {
        //create array list
        ArrayList <String> l1= new ArrayList<String>();
        l1.add("First");
        l1.add("Second");
        l1.add("Third");
        l1.add("Four");

        System.out.println("Contents of array list are:"+l1);

        //add element at specified position
        l1.add(3,"Ashwini");
        System.out.println("Contents of array list are:"+l1);

        //remove element from specified position
        l1.remove(3);
        System.out.println("Contents of array:"+l1);
        
        //we can replace the element at specified position
        l1.set(2,"Ashwini");
        System.out.println("Contents of array are:"+l1);

        //size of the array
        System.out.println("Number of elements are in the list:"+l1.size());
    }
}
