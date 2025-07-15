package lab2;

import java.util.Scanner;

public class NumberGame {

    public static int largestNumber(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int max = largestNumber(a,b,c);
        System.out.println("Largest number is:  " + max);

        sc.close();
    }
}
