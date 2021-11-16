/* Java Program to count frequency of each character from string
*/
import java.lang.*;
import java.util.*;

public class Count_frequency
{
    public void Frequency(String str)
    {
        char ch[]=str.toCharArray();
        int freq[]=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            freq[i]=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    freq[i]++;
                }
            }
        }
        System.out.println("Frequencies are:");
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]+": "+freq[i]);
        }

    } 
    public static void main(String args[])
    {
       Scanner sobj=new Scanner(System.in);
       System.out.println("Enter the String:");
       String str=sobj.nextLine();
       Count_frequency cobj=new Count_frequency();  
       cobj.Frequency(str);
    }
    
}
