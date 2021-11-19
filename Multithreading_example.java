import java.lang.*;
import java.util.*;

class Multithreading_example implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("Inside run method for thread with id"+Thread.currentThread().getId());
            for(int i=1;i<=5;i++)
            {
                System.out.println("Inside thread"+Thread.currentThread().getId()+" "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception obj)
        {
             System.out.println("Exception occured in threading");
        }
    }
    public static void main(String arg[])
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Multithreading_example mobj1=new Multithreading_example();
        Thread t1=new Thread(mobj1);

        Multithreading_example mobj2=new Multithreading_example();
        Thread t2=new Thread(mobj2);

        t1.start();
        t2.start();
    }
}