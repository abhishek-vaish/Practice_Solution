package Solution8;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        String gender;
        int age;
        Scanner scan = new Scanner(System.in);
        gender = scan.nextLine();
        age = scan.nextInt();
        if (gender == "female" && age >= 1 && age <= 58)
            System.out.println("8.2%");
        else if (gender == "female" && age >= 59 && age <= 100)
            System.out.println("9.2%");
        else if (gender == "male" && age >= 1 && age <= 58)
            System.out.println("8.4%");
        else if (gender == "male" && age >= 59 && age <= 100)
            System.out.println("10.5%");
    }

}
