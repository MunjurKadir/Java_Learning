package p03_data_type;
// The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
public class F02_VarKeyword {
    public static void main(String[] args){
        var name = "Shawon"; // STring
        var age = 22; // int
        var cgpa = 3.89; // double
        var grade = 'A'; // char
        var isStudent = true; // boolean

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("CGPA = " + cgpa);
        System.out.println("Grade = " + grade);
        System.out.println("Is student = " + isStudent);

        // var only works when you assign a value at the same time (you can't declare var x; without assigning a value
        // var x;--> Error
        // var x = 5;--> OK

        // Can not be initialize to Null
        // var x = null; --> Error
    }
}
