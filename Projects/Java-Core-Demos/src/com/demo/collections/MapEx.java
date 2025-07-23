/*package com.demo.collections;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        hashMap();
        treeMap();
    }
    

    }

    private static void hashMap(){
        
        Map<Object,Object> map1 = new HashMap<Object,Object>();
        Laptop laptop1 = new Laptop(laptopNameParam:"Inspiron",priceParam:10);
        map1.put(key:"HP", new Laptop(laptopNameParam:"Tuf",priceParam:10));
        map1.put(key:"null", new Laptop(laptopNameParam:"Rog",priceParam:10));
        map1.put(key:null, new Laptop(laptopNameParam:"MacBook",priceParam:10));
        map1.put(key:null, new Laptop(laptopNameParam:"Vaio",priceParam:10));
        map1.put(key:"Sony", new Laptop(laptopNameParam:"Vaio",priceParam:10));
        System.out.println(map1);
        
    }



    class Laptop{
        String laptop;
        float price;
        public Laptop(String laptopNameParam, float priceParam){
            laptop = laptopNameParam;
            price = priceParam;
        }
    }

   private static void treeMap(){
        
        Map<Object,Object> map1 = new TreeMap<Object,Object>();
        Laptop laptop1 = new Laptop(laptopNameParam:"Inspiron",priceParam:10);
        Laptop laptop2 = new Laptop(laptopNameParam:"Thinkpad",priceParam:10);
        map1.put(key:"HP",laptop1);
        String laptopBrand = "Lenovo";
        map1.put(laptopBrand,laptop2);
        map1.put(key:"HP", new Laptop(laptopNameParam:"Tuf",priceParam:10));
        map1.put(key:"null", new Laptop(laptopNameParam:"Rog",priceParam:10));
        map1.put(key:null, new Laptop(laptopNameParam:"MacBook",priceParam:10));
        map1.put(key:null, new Laptop(laptopNameParam:"Vaio",priceParam:10));
        map1.put(key:"Sony", new Laptop(laptopNameParam:"Vaio",priceParam:10));
        System.out.println(map1);
        
    }

 */