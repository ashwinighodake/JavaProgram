import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Collection_arrays {
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("\nEnter the size of array:");
        int no=sobj.nextInt();

        int arr[]=new int[no];
        for(int i=0;i<no;i++)
        {
          arr[i]=sobj.nextInt();
        }
        //contents in the array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        //sort the array in descending array

       Arrays.sort(arr);
       System.out.println("Arrays content after sorting:");
       for(int i=0;i<arr.length;i++)
       {
          System.out.print(arr[i]+"\t");
       }

       //search the element in the array by using binary search technique
       System.out.println("Enter the element which do you want to search:");
       int key=sobj.nextInt();

       int index=Arrays.binarySearch(arr, key);
       if(index>0)
       {
        System.out.println("Element found with position:"+index);
       }
       else
       {
          System.out.println("Given element is not found!!");
       }
        
    }
}
