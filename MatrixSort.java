import java.util.*;
class MatrixSort
{
    int m,a[][];
    MatrixSort(int m1)
    {
        m=m1;
        a=new int[m][m];
    }
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter Elemnts");
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
    void sort()
    {
        int b[]=new int[(m-2)*(m-2)];
        int k=0;
        for(int i=1;i<m-1;i++)
        {
            for(int j=1;j<m-1;j++)
            b[k++]=a[i][j];
        }
        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<k-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                int t=b[j];
                b[j]=b[j+1];
                b[j+1]=t;
               }
            }
        }
        k=0;
        for(int i=1;i<m-1;i++)
        {
            for(int j=1;j<m-1;j++)
            a[i][j]=b[k++];
        }
        System.out.println("Rearranged Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
    void diagonal()
    {
        int sum=0;
        System.out.println("Diagonal Matrix");
        for(int i=0;i<m;i++)
         {
            for(int j=0;j<m;j++)
            {
                if(i==j || i+j==m-1)
                {
                sum += a[i][j];
                System.out.print(a[i][j] +"\t");
                }
                else
                   System.out.print("\t");
           }
           System.out.println();
         }
        System.out.println("Sum of diagonal elements = "+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("M");
        int m=sc.nextInt();
        if(m>3)
        {
        MatrixSort obj= new MatrixSort(m);
        obj.input();
        obj.sort();
        obj.diagonal();
       }
       else 
       System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
    }
}