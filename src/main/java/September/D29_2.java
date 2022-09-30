package September;

import java.util.Scanner;

public class D29_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[10];
        int[] per = new int[10];
        int cnt = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            System.out.println(num[i]);
        }
    }
}
