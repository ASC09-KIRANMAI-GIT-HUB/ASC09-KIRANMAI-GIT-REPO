package lab1;

public class StringClassMethods {
    public static void main(String[] args){
        String string1 = "I am Munjuluri Kiranmai   ";
        String string2 = "I work at Ascnedion";

        System.out.println("charAt(6): " + string1.charAt(6));
        System.out.println("Contains 'at': " + string2.contains("at"));
        System.out.println("Length: " + string1.length());
        System.out.println("Index of 'work': " + string2.indexOf("work"));
        System.out.println("Equals another string: " + string1.equals(string2));
        System.out.println("EqualsIgnoreCase: " + string1.trim().equalsIgnoreCase(string2));
        String joined = String.join(" - ","Java","Python","C++");
        System.out.println("Joined string: " + joined);
        System.out.println("Last index of 'o': " + string1.lastIndexOf("o"));
        System.out.println("Substring from 8: " + string1.substring(8));
        System.out.println("Lowercase: " + string2.toLowerCase());
        System.out.println("Uppercase: " + string1.toUpperCase());
        System.out.println("Trimmed: '" + string1.trim() + "'");

    }
}
