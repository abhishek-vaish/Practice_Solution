package Solution5;

import java.util.Scanner;

public class odd {
    public static void main(String[] args){
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        if (num / 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
