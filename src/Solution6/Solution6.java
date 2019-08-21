package Solution6;

import java.util.Scanner;

public class Solution6 {
    public static void main(String args[]){
        char str1;
        char str2;
        Scanner scan = new Scanner(System.in);
        str1 = scan.next().charAt(0);
        str2 = scan.next().charAt(0);
        int value = str1;
        int value1 = str2;
        if (value > value1)
            System.out.println(str2 + " " + str1);
        else
            System.out.println(str1 + " " + str2);

    }
}
