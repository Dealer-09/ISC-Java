 import java.util.*;
 class mirror
 {
     int m,x[][],y[][];
    mirror(int m1)
    { 
        m=m1;
        x= new int[m][m];
        y=new int[m][m];
    }
     Scanner sc=new Scanner (System.in);
     void input()
     {
      System.out.print ("Enter Elements of Matrix");
      for (int i=0;i<m;i++)
      {
          for (int j=0;j<m;j++)
                x[i][j]=sc.nextInt();   
        }
         }
    void compute()
    {
       for (int j=0;j<m;j++)
       {
       for (int i=0;i<m;i++)
       {
        y[i][m-1-j]=x[i][j];
       } 
    }
   }
     void display()
     {
         System.out.print ("Output");
        for (int i=0;i<m;i++)
        {
       for (int j=0;j<m;j++)
       {
        System.out.print(y[i][j]+" ");
        }
        System.out.println();
    }          
   }
    public static void main(String args[])
   {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter row and columns of matrix");
       int m=sc.nextInt();
       if(m >0)
        {
        mirror obj=new mirror(m);
        obj.input();
        obj.compute();
        obj.display();
          }
       else
       System.out.println("Invalid Input");
    }
}