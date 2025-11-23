import java.util.*;
class Array_to_Stack
{
    int m[],st[],cap,top;
    Array_to_Stack(int n)
    {
        cap=n;
        top=-1;
        m= new int[cap];
        st= new int[cap];
    }
    void input_marks()
      {
          int i;
          try (Scanner sc = new Scanner(System.in)) {
			for(i=0;i<cap;i++)
			{
			    System.out.println("Enter a no");
			    m[i]= sc.nextInt();
			    pushmarks(m[i]);
			  }
		}
    }
    void pushmarks(int v)
    {
        if(top==cap-1)
        {
            System.out.println("Stack is full");
        }
        else 
        {
            st[++top]=v;
        }
    }
    int popmarks()
    {
        if (top==-1)
        {
            return(-999);
        }
        else 
        return(st[top--]);
    }
    void display()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.println(st[i]);
        }
    }
    public static void main(String args[])
    {
        try(Scanner sc= new Scanner(System.in)) {
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        Array_to_Stack obj =new  Array_to_Stack(n);
        obj. input_marks();
        obj.popmarks();
        obj.display();
        }
    }
}