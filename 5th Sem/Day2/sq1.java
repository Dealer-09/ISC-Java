/* Print the Sequence ABA, BCB, CDC, DED */
class sq1
{
    public static void main(String args[])
    {
        char ch1,ch2;
        for(ch1='A';ch1<='D';ch1++)
        {
            ch2=(char)(ch1+1);
            System.out.println(ch1+""+ch2+""+ch1);
        }
    }
}