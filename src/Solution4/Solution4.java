package Solution4;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args){
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        if (num < 0) {
            System.out.println("Negative");
        } else if (num > 0)
            System.out.println("Positive");
        else
            System.out.println("Zero");
    }
}
