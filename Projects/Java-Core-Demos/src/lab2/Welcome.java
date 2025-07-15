package lab2;
import java.util.Scanner;

public class Welcome {
    public static String welcomeMessage(String name){
        return "Hello  " + name + ", Welcome to Java World!";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        String message = welcomeMessage(name);
        System.out.println(message);


        sc.close();
    }
}
