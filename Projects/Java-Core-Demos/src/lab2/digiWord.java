package lab2;
import java.util.Scanner;

public class digiWord {
    public static void printDigitsInWords(int num){
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String numStr = String.valueOf(num);
        for (char digit : numStr.toCharArray()){
            System.out.print(words[digit - '0'] + " ");
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = sc.nextInt();
        printDigitsInWords(num);

        sc.close();
    }
}
