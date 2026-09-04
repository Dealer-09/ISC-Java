import java.util.*;
class bubble
{
    int x[][],y[],m,n;
    bubble(int m1)
    {
        m=m1;
        x =new int[m][m];
        y= new int[m*m];
    }
    Scanner sc=new Scanner (System.in); 
    void input()
    {
     System.out.println("Enter Elements Array");
     for (int i=0;i<m;i++)
     {
        for (int j=0;j<m;j++)
        x[i][j]=sc.nextInt();   
       }
    }
    void calc()
    {
        int temp=0;
        for (int k=0;k<m;k++)
        {
            for (int i=0;i<m;i++)
            {
                 for (int j=0;j<m-i-1;j++)
                  {
                     if (x[k][j]>x[k][j+1])
                     {
                          temp= x[k][j];
                          x[k][j]=x[k][j+1];
                          x[k][j+1]=temp;
                        }
                    }
                }
            }                 
      }
    void display()
    {
     System.out.println("Output");
         for (int i=0;i<m;i++)
      {
        for(int j=0;j<m;j++)
        System.out.print(x[j][i]+" ");
        System.out.println();
     }
    }
     public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter row and columns of matrix");
      int m=sc.nextInt();
      bubble obj=new bubble (m);
      obj.input();
      obj.calc();
      obj.display();
    }
}