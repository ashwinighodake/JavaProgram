import java.lang.*;

class Synchronisation_example extends Thread
{
    synchronized public void Display()
    {
        for(int i=1;i<=500;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
    public void run()
    {
        Display();
    }
    public static void main(String args[])
    {
      Synchronisation_example obj=new Synchronisation_example();
      Thread t1=new Thread(obj,"First");
      Thread t2=new Thread(obj,"Second");

      t1.start();
      t2.start();
    }
}