package p06_strings;

public class F04_SpecialCharacters {
    public static void main(String[] args){
        //  The backslash (\) escape character turns special characters into string characters

        //    \'	   '   	 Single quote
        //    \"	   "	 Double quote
        //    \\	   \	 Backslash

        //      \n	   New Line
        //      \t	   Tab
        //      \b	   Backspace
        //      \r	   Carriage Return
        //      \f	   Form Feed

        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        String txt1 = "It\'s alright.";
        System.out.println(txt1);

        String txt2 = "The character \\ is called backslash.";
        System.out.println(txt2);
    }
}
