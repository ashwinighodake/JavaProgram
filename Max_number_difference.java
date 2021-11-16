/*Write a java program to find maximum difference between two elements such that 
larger elements appears after the smallest number
e.g [2 3 10 6 4 8 1]
output:8(10-2)
*/

import java.lang.*;
import java.util.*;

class Max_number_difference
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter how many elements you want to insert:");
        int no=sobj.nextInt();
        
        int arr[]=new int[no];
        System.out.println("Insert the elements in the array:");
        for(int i=0;i<no;i++)
        {
          arr[i]=sobj.nextInt();
        }
        Array aobj=new Array();
        int iret=aobj.MaxDiff(arr);
        System.out.println("Difference is:"+iret);
    }
}
class Array
{
    int MaxDiff(int Arr[])
    {
        int iSum=0,iMax=0;
       for(int i=0;i<Arr.length;i++)
       {
           for(int j=i+1;j<Arr.length;j++)
           {
              iSum=Arr[j]-Arr[i];
              if(iMax<iSum)
              {
                  iMax=iSum;
              }
           }
       }
       return iMax;
    }
}