package lab1;

import java.util.Scanner;
public class MultiplicationTable {

    public static void forLoopTable(int n){
        System.out.println("Using for loop");
        for(int i = 1; i <= 10; i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }

    public static void whileLoopTable(int n){
        System.out.println("Using while loop");
        int i = 1;
        while (i<=10){
            System.out.println(n+"x"+i+"="+(n*i));
            i++;
        }
    }

    public static void doWhileTable(int n){
        System.out.println("Uisng do-while loop");
        int i = 1;
        do{
            System.out.println(n+"x"+i+"="+(n*i));
            i++;
        }while(i<=10);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number n:");
        int n = scanner.nextInt();

        forLoopTable(n);
        whileLoopTable(n);
        doWhileTable(n);

        scanner.close();
    }
}
