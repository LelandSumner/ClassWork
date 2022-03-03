public class ArrayParameters {

    /*
    *******************************************************************
    Main method. Call other methods that exercise passing arrays as
    parameters.
    *******************************************************************
    */
    public static void main(String[] args) {

        double[] someDoubles = randomDoubles(20);

        System.out.println("The original array:");
        printDoubles(someDoubles, "\n");

        shiftDoubles(someDoubles, -0.5);
        scaleDoubles(someDoubles, 10.0);

        System.out.println("All elements, after shifting and scaling");
        printDoubles(someDoubles, "\n");
        System.out.println("Negative elements, after shifting and scaling");
        printNegativeElements(someDoubles, ", ");

        System.out.println("Now testing array copying.");
        System.out.println("Array someDoubles:");
        printDoubles(someDoubles, ", ");
        
        double[] aCopy = copyDoubles(someDoubles);

        System.out.println("A copy of someDoubles:");
        printDoubles(aCopy, ", ");
        
        scaleDoubles(someDoubles, 0.0);         // zero-out original

        System.out.println("Array someDoubles after scaling by 0.0:");
        printDoubles(someDoubles, ", ");
        System.out.println("The copy: ");
        printDoubles(aCopy, ", ");
        
    }


    /*
    *******************************************************************
    STEP 1: Print an array of doubles, using the specified string to
        separate them.
    
    [Comment-out or delete the stub when the method is implemented]
    *******************************************************************
    */
    public static void printDoubles(double[] theArray, String delimiter) {
        System.out.println("printDoubles STUB: NOT YET IMPLEMENTED");
    }


    /*
    *******************************************************************
    STEP 2: Shift each element of the array, by adding the given delta
        to each element. No need to return anything due to reference
        semantics.
    
    [Comment-out or delete the stub when the method is implemented]
    *******************************************************************
    */
    public static void shiftDoubles(double[] theArray, double delta) {
        System.out.println("shiftDoubles STUB: NOT YET IMPLEMENTED");
    }


    /*
    *******************************************************************
    STEP 3: Scale each element of the array, by multiplying each
        element by the given scale factor. No need to return anything
        due to reference semantics.
    
    [Comment-out or delete the stub when the method is implemented]
    *******************************************************************
    */
    public static void scaleDoubles(double[] theArray, double scale) {
        System.out.println("scaleDoubles STUB: NOT YET IMPLEMENTED");
    }


    /*
    *******************************************************************
    STEP 4: Same as printDoubles, except only strictly negative
        elements are printed.
    
    [Comment-out or delete the stub when the method is implemented]
    *******************************************************************
    */
    public static void printNegativeElements(double[] theArray,
            String delimiter) {
        System.out.println("printNegativeElements STUB: NOT YET IMPLEMENTED");
    }

    
    /*
    *******************************************************************
    STEP 5: Create and return a new array of doubles, whose contents
        are a copy of the original array.
        
    NOTE: you will have to create a new array! Then use an array
        traversal loop to set each element of the copy to the same
        value as the respective element of the original. It may be
        useful to look at the method randomDoubles() below.
        
    NOTE: You will need to use the expression "original.length" to
        find out how many elements there are in the original. Use
        this number when declaring the copy.
    
    [Comment-out or delete the stub when the method is implemented]
    *******************************************************************
    */
    public static double[] copyDoubles(double[] original) {
        // STUB
        System.out.println("copyDoubles: STUB: NOT YET IMPLEMENTED");
        return new double[0];
        // STUB END
    }


    /*
    *******************************************************************
    Create and return an array of n randomly-generated doubles,
        each in the range [0,1).
    PRE: n >= 0
    *******************************************************************
    */
    public static double[] randomDoubles(int n) {
        // sanity check
        if (n < 0) {
            throw new IllegalArgumentException("argument must be non-negative");
        }

        // Now do the real work.
        double[] theArray = new double[n];
        for (int i = 0; i < n; ++i) {
            theArray[i] = Math.random();
        }

        return theArray;
    }

} // end class