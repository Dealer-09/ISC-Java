import java.util.*;
class SquaMatrix
{
    int A[][],M;
    Scanner sc=new Scanner(System.in);
    SquaMatrix(int size)
    {
       M=size;
       A=new int[M][M];
    }
    void input()
    {
        System.out.println("Enter elements");
        for(int i=0;i<M;i++)
        for(int j=0;j<M;j++)
        A[i][j]=sc.nextInt();
    }
    void compute()
    {
        int flag=0,ld=0,rd=0;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(A[i][j]!=A[j][i])
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        System.out.println("Not Symmetric");
        else
        System.out.println("Symmetric");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(i==j)
                ld=ld+A[i][j];
                if((i+j)==(M-1))
                rd=rd+A[i][j];
            }
        }
        System.out.println(ld);
        System.out.println(rd);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int m=sc.nextInt();
        if(m>2&&m<10)
        {
            SquaMatrix obj=new SquaMatrix(m);
            obj.input();
            obj.compute();
        }
        else
        System.out.println("Invalid");
    }
}
