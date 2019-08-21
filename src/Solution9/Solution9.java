package Solution9;

import java.util.Scanner;
public class Solution9 {
    public static void main(String[] args) {
        char value;
        Scanner scan = new Scanner(System.in);
        value = scan.next().charAt(0);
        int value1 = value;
        if (value1 >= 97 && value1 <= 122)
            System.out.println(Character.toUpperCase(value));
        else if (value >= 65 && value1 <= 90)
            System.out.println(Character.toLowerCase(value));

    }


}
