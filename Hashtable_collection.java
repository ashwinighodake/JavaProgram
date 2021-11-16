import java.lang.*;
import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable_collection {
    
   public static void main(String[] args)
    {
       Hashtable<String,Integer>h1=new Hashtable<String,Integer>();
       
       //Inserting elements into hash table
       h1.put("Ten",10);
       h1.put("Twenty",20);
       h1.put("Thirty",30);
       h1.put("Fourty",40);

       //Enumerating the hash Table Elements
       System.out.println("Enumerating the hash table");
       Enumeration it=h1.keys();
       while(it.hasMoreElements())
       {
           System.out.println(it.nextElement()+ " ");
       }

       //we can retrieve the contents from hash table
       System.out.println("Value of Ten is"+h1.get("Ten"));

       //we can remove elements by specifying key
       h1.remove("Twenty");

       //we can retrieve size of hash table
       System.out.println("Size of the hashtable is"+h1.size());

       //we can remove all elements from hashtable
       h1.clear();
    }
}
