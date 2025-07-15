package com.demo.collections;
import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args){
       genericTypes();
    }

//rawTypes

  /*  private static void rawTypes(){

        ArrayList colorList = new ArrayList();
        colorList.add("Red");
        colorList.add(null);
        colorList.add("Green");
        ArithmeticException arithmeticException = new ArithmeticException("Sample Exception");
        colorList.add(arithmeticException);
    */

//genericTypes

    private static void genericTypes(){

        ArrayList<String> colorList = new ArrayList<String>();
        colorList.add("Red");
        colorList.add(null);
        colorList.add("Green");
        ArithmeticException arithmeticException = new ArithmeticException("Sample Exception");
        System.out.println(colorList);

        ArrayList<Integer> integersList = new ArrayList<Integer>();
        integersList.add(10);
        integersList.add(20);
        integersList.add(null);
        System.out.println(integersList);

        ArrayList<Number> numbersList = new ArrayList<Number>();
        numbersList.add(10);
        numbersList.add(20.5);
        numbersList.add(30.0f);
        numbersList.add(null);
        System.out.println(numbersList);
    }

}



