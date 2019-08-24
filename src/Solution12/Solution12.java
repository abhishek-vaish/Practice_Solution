package Solution12;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        int value;
        Scanner scan = new Scanner(System.in);
        value = scan.nextInt();
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                System.out.println(value + " is not a Prime number.");
                break;
            } else {
                System.out.println(value + " is a Prime number.");
                break;
            }

    }
    }
}
