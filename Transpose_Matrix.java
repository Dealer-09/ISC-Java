 import java.util.*;
 class Transpose_Matrix
 {
     int m,n,x[][],y[][];
    Transpose_Matrix (int r,int c)
    { 
        m=r;
        n=c;
        x= new int[m][n];
        y=new int[n][m];
    }
     Scanner sc=new Scanner (System.in);
     void input()
     {
      System.out.print ("Enter Elements of Matrix");
      for (int i=0;i<m;i++)
      for (int j=0;j<n;j++)
      x[i][j]=sc.nextInt();     
     }
    void compute()
    {
       for (int i=0;i<m;i++)
       for (int j=0;j<n;j++)
        y[i][j]=x[j][i];
        System.out.println("x");
        display(x,m,n);
        System.out.println("y");
        display(y,m,n);
    }    
     void display(int a[][],int r,int c)
     {
        for (int i=0;i<r;i++)
        {
       for (int j=0;j<c;j++)
       {
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }          
   }
    public static void main(String args[])
   {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter row and columns of matrix");
       int m=sc.nextInt();
       int n=sc.nextInt();
       if(m >0 && n>0)
        {
        Transpose_Matrix obj=new Transpose_Matrix(m,n);
        obj.input();
        obj.compute();
          }
       else
       System.out.println("Invalid Input");
    }
}