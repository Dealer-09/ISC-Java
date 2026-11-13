/* Display The Sequence A1,B2,C3,.....,Y25,Z26*/
public class sq3 {
    public static void main(String[] args) {
        char ch;
        for (ch = 'A'; ch <= 'Z'; ch++) {
            int num = ch - 'A' + 1;
            System.out.println(ch + "" + num);
        }
    }
}