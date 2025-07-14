package lab1;

public class AddMethods {
//   two integer addition
     public void add(int a, int b){
         System.out.println (a+b);
     }
//   three integer addition
     public void add(int a, int b, int c){
         System.out.println(a+b+c);
     }
//   two double addition
     public void add(double a, double b){
         System.out.println(a+b);
     }
//   string and integer addition
     public void add(String a, int b){
          System.out.println(a + " " + b);
     }

//   Testing the add Methods
     public static void main(String[] args) {
        AddMethods obj = new AddMethods();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.1);
        obj.add("Hello", 20);

     }
}