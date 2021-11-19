import java.io.*;
import java.net.*;

class Server
{
    public static void main(String arg[])throws Exception
    {
       System.out.println("Server is Running...");
       ServerSocket ss=new ServerSocket(2101);
       Socket s=ss.accept();

       System.out.println("Connection is established Successfully");
       DataOutputStream d=new DataOutputStream(s.getOutputStream());
       BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
       BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));

       String str1,str2;
       while((str1=br.readLine())!=null)
       {
           System.out.println(str1);
           str2=br1.readLine();
           System.out.println(str2);
       }
    }
}