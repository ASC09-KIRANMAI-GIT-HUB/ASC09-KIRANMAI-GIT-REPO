package lab1;

import java.util.*;

public class ArrayStore {
    int[] arr = new int[20];
    int size = 10;

    //Accept 10 integers and store into the array
    public void acceptElements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    //Display using for loop
    public void displayForLoop(){
        System.out.println("For loop: ");
        for (int i = 0; i < size; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    //Display using while loop
    public void displayWhileLoop(){
        System.out.println("While loop: ");
        int i=0;
        while (i<size){
            System.out.println(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    //Sort the array
    public void sortArray(){
        Arrays.sort(arr, 0 , size);
        System.out.println("Sorted array: ");
        displayForLoop();
    }

    //Count number of occurences of a number
    public int countOccurences(int num){
        int count = 0;
        for (int i = 0; i<size; i++){
            if (arr[i]==num){
                count++;
            }
        }
        return count;
    }

    //Insert a number at a specific position
    public void insertAtPosition(int num, int pos){
        if (size >= arr.length || pos<0 || pos>size){
            System.out.println("Insertion failed: Invalid position or array if full.");
            return;
        }
        for (int i = size; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = num;
        size++;
        System.out.println("After insertion: ");
        displayForLoop();
    }

    //Return array excluding duplicates
    public int[] getUniqueArray(){
        int[] unique = new int[size];
        int uniqueSize = 0;

        for (int i =0; i<size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueSize; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[uniqueSize] = arr[i];
                uniqueSize++;
            }
        }

        int[] finalUnique = new int[uniqueSize];
        for (int k=0; k<uniqueSize; k++){
                finalUnique[k] = unique[k];
        }
        return finalUnique;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayStore store = new ArrayStore();

        store.acceptElements();
        store.displayForLoop();
        store.displayWhileLoop();
        store.sortArray();

        System.out.println("Enter number to count: ");
        int num = sc.nextInt();
        System.out.println("Count of " + num + " : " + store.countOccurences(num));
        System.out.print("Enter number to insert: ");
        int newNum = sc.nextInt();
        System.out.println("Enter position: ");
        int pos = sc.nextInt();
        store.insertAtPosition(newNum, pos);

        System.out.println("Array without duplicates: ");
        int[] uniqueArr = store.getUniqueArray();
        for (int val : uniqueArr){
            System.out.println(val + " ");
        }
    }
}
