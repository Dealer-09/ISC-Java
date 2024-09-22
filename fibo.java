import java.util.*;
public class fibo 
{
    int fib(int n)
    {
        if(n<=1)
        return n;
        else
        return(fib(n-1)+fib(n-2));
   }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Input");   
     int n=sc.nextInt();
     fibo obj =new fibo();
     for(int i=0;i<n;i++)
     {
       int s=obj.fib(i);
       System.out.print(" "+s);
     } 
     System.out.println();
   }
}
