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

        //Insert data at specified position
        l1.add(3,"Prajakta");
        System.out.println("Updated Linked list:"+l1);

        //remove first element from linked list
        l1.removeFirst();
        System.out.println("First Element removed: "+l1);

        //replacing the specified position element
        l1.set(3,"pranali");
        System.out.println("Upadated linked list:"+ l1);
        
        System.out.println("Number of elements in the linked list are:"+l1.size());

        
        //by using iterator to iterate the linked list
        Iterator it=l1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
    }
    
}
