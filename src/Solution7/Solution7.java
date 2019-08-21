package Solution7;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        char value;
        Scanner scan = new Scanner(System.in);
        value = scan.next().charAt(0);
        int value1 = value;
        if (value1 >= 97 && value1 <= 122 || value1 >= 65 && value1 <= 90)
            System.out.println("Alphabet");
        else if (value1 >= 48 && value1 <= 57)
            System.out.println("Digits");
        else
            System.out.println("Special Character");
    }
}
