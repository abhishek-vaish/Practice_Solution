package Solution13;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        int value;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        value = scan.nextInt();
        int result;
        while (value > 0) {
            result = value;
            result = result % 10;
            value = value / 10;
            sum = sum + result;
        }
        System.out.println(sum);
    }
}
