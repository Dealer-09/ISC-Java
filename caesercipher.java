import java.util.*;
class caesercipher
{
    Scanner sc=new Scanner(System.in);
    String s="",s1="";
    int L=0;
    void input()
    {
        System.out.println("enter a text");
        s=sc.nextLine();
        
    }
    void check()
    {
        L=s.length();
        if(L>=3&&L<=100)
        compute(s,L);
        else
        System.out.println("Invalid length");
    }
    void compute(String s,int L)
    {
        char ab='\u0000',cd='\u0000';
        
        for(int i=0;i<L;i++)
        {
            ab=s.charAt(i);
            if(ab!=32)
            {
                if((ab>='A'&&ab<='M')||(ab>='a'&&ab<='m'))
                {
                    cd=(char)(ab+13);
                    s1=s1+cd;
                }
                 if((ab>='N'&&ab<='Z')||(ab>='n'&&ab<='z'))
                 {
                     cd=(char)(ab-13);
                    s1=s1+cd;  }
              }
            else
            s1=s1+ab;
        }
        System.out.println(s1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        caesercipher obj=new caesercipher();
        obj.input();
        obj.check();
    }
    }
