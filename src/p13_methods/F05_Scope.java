package p13_methods;

public class F05_Scope {
    public static void main(String[] args){
        // Scope = variable কোথা থেকে কোথা পর্যন্ত ব্যবহার করা যাবে।
        // Outer scope → Inner scope-এর variable দেখতে পারে না।
        // Inner scope → Outer scope-এর variable দেখতে পারে।
        method();
        method1();
        // Loop Scope
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i is accessible here
        }
        // i is NOT accessible here
    }
    static void method() {

        int b = 20; // Local variable

        if (true) {

            int c = 30; // Block variable

            System.out.println(b); // ✅
            System.out.println(c); // ✅
        }

        System.out.println(b); // ✅
        // System.out.println(c); // ❌
    }
    static void method1() {

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x

    }
}
