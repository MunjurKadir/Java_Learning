package p06_strings;

public class F01_StringBasics {
    public static void main(String[] args){
        String greeting = "Hello!";
        String gd = "Good Morning";
        System.out.println(greeting.length()); // length() --> to know the length of a String along with whitespace
        System.out.println(gd.length());

        String hello = "Hello Shawon";
        System.out.println(hello.toUpperCase()); // toUpperCase() --> converts a string to upper case letters
        System.out.println(hello.toLowerCase()); // toLowerCase() --> converts a string to lower case letters

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // indexOf() --> returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)

        String name = "Rakib";
        System.out.println(name.charAt(0)); // charAt() --> to access a character at a specific position in a string:
        System.out.println(name.charAt(4));

        String txt1 = "Hello";
        String txt2 = "Hello";
        String txt3 = "Greetings";
        String txt4 = "Great things"; // equals() --> To compare two strings
        System.out.println(txt1.equals(txt2));  // true
        System.out.println(txt3.equals(txt4));  // false

        System.out.println(name.contains("k"));  // contains() --> If the character/word are there

        String w = "  Hello World   ";
        System.out.println("Before: [" + w + "]");
        System.out.println("After: [" + w.trim() + "]"); // trim() --> removes whitespace from the beginning and the end of a string

    }
}
