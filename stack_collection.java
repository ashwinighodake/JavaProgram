import java.lang.*;
import java.util.*;

public class stack_collection
{
    public static void main(String arg[])
    {
        Stack<Integer> st=new Stack<Integer>();

        //insert the contents in the stack
        st.push(10);
        st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		//int i;
		// Remove the contents from stack
		Integer element = st.pop();
		System.out.println("Poped element is "+element);

		// We can search element in stack as
		int position = 0;
		position = st.search(30);
		if(position  == -1)
		{
			System.out.println("There is no such element is stack");
		}
		System.out.println("Element is found at position "+position);
	
		// Display all the contents of stack
		System.out.println("\nStack contains : "+st);
    }
    
}
