/*
   Write java program to print below pattern 
                     *
                    * *
                  *  *  *
                * *  *  * *
*/
import java.lang.*;
import java.util.*;

class Pattern1
{
    public void Draw_pattern(int row)
    {
         for(int i=0;i<row;i++)
         {
             for(int j=row;j>i;j--)
             {
                 System.out.print(" ");
             }
             
             for(int j=0;j<=i;j++)
             {
                 System.out.print(" * ");

             }
             System.out.println();
         }
    }
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter number of rows:");
        int no=sobj.nextInt();
        
        Pattern1 pobj=new Pattern1();
        pobj.Draw_pattern(no);
    }
}
