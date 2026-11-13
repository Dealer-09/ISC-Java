/* Print the Sequence AMM, COO, EQQ */
public class sq2 {
    public static void main(String[] args) {
        char ch1, ch2;
        for (ch1 = 'A'; ch1 <= 'E'; ch1 += 2) {
            ch2 = (char) (ch1 + 1);
            System.out.println(ch1 + "" + ch2 + "" + ch2);
        }
    }
}