package September;

import java.math.BigInteger;
import java.util.Scanner;

public class D0925 {
    public static void main(String[] args) {
        // CodeUp 1754
        Scanner scan = new Scanner(System.in);

        String one = scan.next();
        String two = scan.next();


        BigInteger one1 = new BigInteger(one);
        BigInteger two2 = new BigInteger(two);

        if (one1.compareTo(two2) > 0){
            System.out.println(two2 + " " + one1);
        }else{
            System.out.println(one1 + " " + two2);
        }

    }
}
