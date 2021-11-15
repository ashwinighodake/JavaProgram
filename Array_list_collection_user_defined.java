import java.lang.*;
import java.util.*;

class Student
{
    int rollno;
    String name;
    int age;
    Student(int rno,String name,int age)
    {
      this.rollno=rno;
      this.name=name;
      this.age=age;
    }
}
public class Array_list_collection_user_defined
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the roll number:");
        int rno=sobj.nextInt();
        System.out.println("Enter the name:");
        String name=sobj.nextLine();
        name=sobj.nextLine();
        System.out.println("Enter the age:");
        int age=sobj.nextInt();

        Student obj1=new Student(rno, name, age);

        System.out.println("Enter the roll number:");
        rno=sobj.nextInt();
        System.out.println("Enter the name:");
        name=sobj.nextLine();
        name=sobj.nextLine();
        System.out.println("Enter the age:");
        age=sobj.nextInt();

        Student obj2=new Student(rno, name, age);

        System.out.println("Enter the roll number:");
        rno=sobj.nextInt();
        System.out.println("Enter the name:");
        name=sobj.nextLine();
        name=sobj.nextLine();
        System.out.println("Enter the age:");
        age=sobj.nextInt();

        Student obj3=new Student(rno, name, age);
        
        ArrayList<Student>l1=new ArrayList<Student>();
        l1.add(obj1);
        l1.add(obj2);
        l1.add(obj3);

        Iterator itr=l1.iterator();
        while(itr.hasNext())
        {
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
