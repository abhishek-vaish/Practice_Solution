package practice;
import java.util.*;


public class welcome {
    public static String mess;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        mess = scan.nextLine();
        System.out.println("Welcome, "+mess+"!");
    }

}
