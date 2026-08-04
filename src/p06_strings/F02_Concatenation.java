package p06_strings;

public class F02_Concatenation {
    public static void main(String[] args){
        String firstname = "Rakib";
        String lastname = "Hassan";
        System.out.println(firstname + " " + lastname);

        String name = "Shawon";
        int age = 22;
        System.out.println("My name is " + name + ". I'm " + age + " years old.");

        String Fname = "Mim ";
        String Lname = "Mozahid";
        System.out.println("Name: " + Fname.concat(Lname));

        String x = "Java ";
        String y = "is ";
        String z = "fun.";
        String result = x.concat(y).concat(z);
        System.out.println(result);
        System.out.println(x.concat(y).concat(z));
    }
}
