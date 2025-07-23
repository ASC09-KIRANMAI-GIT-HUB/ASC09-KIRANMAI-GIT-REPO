package com.demo.collections;

import java.sql.SQLOutput;

public class FunctionalInterfaceEx {
    public static void main(String[] args){
        Discount summerSale = new Discount(){
            @Override
            public double apply(double price){
                return price * 0.8;
            }
        };

        Discount summerSale1 = (price) -> price * 0.8;

        double originalPrice = 100;
        System.out.println("Discounted price: $" + summerSale1.apply(originalPrice));
    }
}

@FunctionalInterface
interface Discount {
    double apply(double price); 
}

class DiscountImpl implements Discount {
    @Override
    public double apply(double price){
        return price * 0.8;
    }
}
