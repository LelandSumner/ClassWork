public class StringArrays {

    /*
    *******************************************************************
    Main method. Call other methods that exercise use of String arrays.
    *******************************************************************
    */
    public static void main(String[] args) {

        // STEP 1: Initialize the month array so month[0] is "January",
        //  month[1] is "February", and so on.
        // What's the easiest way to do this initialization?
        String[] month;

        System.out.println("The months of the year are:");
        printStrings(month, "\n");
        

        // STEP 3: Initialize the daysInMonth array so daysInMonth[0]
        //  is 31 (the number of days in January), daysInMonth[1] is
        //  28 (the number of days in February), and so on.
        // What's the easiest way to do this initialization?
        int [] daysInMonth;


        // STEP 4: Write a loop that, in its body, access both the
        //  month and daysInMonth arrays, in order to print out the
        //  names of the month and the number of days in each. That
        //  is, it should output a list like:
        //      January: 31 days
        //      February: 28 days
        //      March: 31 days
        //      ... and so on.



        // STEP 5: look at the method header for main. It has a
        //  parameter that, until now, we've never used and we've
        //  never understood what it was for.
        // Write a simple statement that calls printStrings() and
        //  gives it the parameter you found in main's header.
        // Next, compile and re-run the program, only this time
        //  run it by typing "java StringArrays arg1 arg2 arg3".
        //  What happens?

    }


    /*
    *******************************************************************
    STEP 2: Print the elements of the String array, separated by the
        delimiter.

    [Comment-out or delete the stub when the method is implemented]
    *******************************************************************
    */
    public static void printStrings(String[] arr, String delimiter) {
        System.out.println("printStrings: STUB: NOT YET IMPLEMENTED");
    }


} // end class