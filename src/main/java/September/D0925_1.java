package September;

import java.math.BigInteger;
import java.util.Scanner;

public class D0925_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String three = scan.nextLine();

        BigInteger t3 = new BigInteger(three);
        BigInteger real3 = new BigInteger("3");
        BigInteger zero = new BigInteger("0");


        if (t3.remainder(real3).equals(zero)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
