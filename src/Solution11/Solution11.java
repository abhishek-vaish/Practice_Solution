package Solution11;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        int value1;
        int value2;
        Scanner scan = new Scanner(System.in);
        value1 = scan.nextInt();
        value2 = scan.nextInt();
        for (int i = value1 + 1; i < value2; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
