import java.lang.*;
import java.util.*;

public class Linked_list_collection
{
    public static void main(String arg[])
    {
        LinkedList <String> l1=new LinkedList<String>();
        Scanner sobj=new Scanner(System.in);
        System.out.println("Insert the elements in linked list");
        char ch='Y';
        String name;

        while(ch=='Y'|| ch=='y')
        {
          System.out.println("Enter the element");
          name=sobj.nextLine();
          name=sobj.nextLine();
          l1.add(name);

          System.out.println("Do you want to insert again(Y/N):");
          ch=sobj.next().charAt(0);
        }
        System.out.println("Contents of linked list are:"+l1);
    }
    
}
