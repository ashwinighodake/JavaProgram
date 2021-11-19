import java.lang.*;

class Join_method extends Thread
{
    public void run()
    {
        Thread ref=Thread.currentThread();
        System.out.println(ref.getName());
    }
    public static void main(String arg[])
    {
      Join_method obj=new Join_method();
      Thread t1=new Thread(obj,"First");
      Thread t2=new Thread(obj,"Second");

      t1.start();
      try
      {
         t1.join();
      }
      catch(Exception robj)
      {

      }
      t2.start();
    }
}