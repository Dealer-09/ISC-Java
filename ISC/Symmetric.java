import java.util.*;
class Symmetric
{
    int m,a[][],flag=0,RD=0,LD=0;
    Symmetric(int m1)
    {
        m=m1;
        a=new int[m][m];
    }
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter Elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("Original");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
    void symmetric()
    {
       for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    flag=1;
                    break;
                }
            }
        }
       if(flag==0)
        System.out.println("The Given Matrix is symmetric");
        else 
        System.out.println("The given Matrix is not symmetric");
    }
    void sum()
    {
        for(int i=0;i<m;i++)
        {
            LD=LD+a[i][i];
            RD=RD+a[i][m-1-i];
        }
        System.out.println("The Sum of the left diagonal :"+LD);
        System.out.println("The Sum of the right diagonal :"+RD);
    }
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of matrix");
        int m=sc.nextInt();
        if(m>2 && m<10)
        {
           Symmetric obj= new Symmetric(m);
           obj.input();
           obj.symmetric();
           obj.sum();
        }
        else 
        System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
    }
}