/*Write java program which add two matrices*/
import java.lang.*;
import java.util.*;

class Add_Matrices
{
    public void Addition(int Arr[][],int Brr[][],int row,int column)
    {
        int sum[][]=new int[row][column];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
              sum[i][j]=Arr[i][j]+Brr[i][j];  
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
              System.out.print(sum[i][j]+"\t");  
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter the number of rows of the Matrices:");
       int row=sobj.nextInt();

       System.out.println("Enter the number of column of the Matrices:");
       int column=sobj.nextInt();

       int Arr[][]=new int[row][column];

       int Brr[][]=new int[row][column];

       System.out.println("Insert the elements in first Matrix:");
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<column;j++)
           {
               System.out.print("Arr["+i+"]["+j+"]:");
               Arr[i][j]=sobj.nextInt();
               
           }
           System.out.println();
       }
       System.out.println("Insert the elements in second Matrix:");
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<column;j++)
           {
               System.out.print("Brr["+i+"]["+j+"]:");
               Brr[i][j]=sobj.nextInt();
            
           }
           System.out.println();
       }
       Add_Matrices obj=new Add_Matrices();
       obj.Addition(Arr,Brr,row,column);

    }
}