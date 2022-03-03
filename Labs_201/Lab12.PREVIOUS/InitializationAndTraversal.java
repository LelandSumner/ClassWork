public class InitializationAndTraversal {

    public static void main(String[] args) {

        double[] arr1 = new double[10];

        arr1[0] = 0.0;
        arr1[1] = 1.0;
        arr1[2] = 2.0;
        // STEP 1: continue the pattern, initializing all elements of arr1



        // STEP 2: Initialize arr2 so that it's elements are the same as
        //  those in arr1. Do this by replacing the comment, so that
        //  declaration and initialization are just one statement.
        double[] arr2 = { /* fill this list in */ };


        // STEP 3: Initialize bigArray so that the element values are similar
        //  to those in the first two arrays. For example bigArray[0] is 0.0,
        //  bigArray[9] is 9.0, and bigArray[999] is 999.0.
        // Hint: use an array-traversal "for" loop
        double[] bigArray = new double[1000];

    

        // STEP 4: Write an array-traversal loop that sums up all elements
        //  in bigArray that are at even indexes. That is, compute the sum
        //  bigArray[0] + bigArray[2] + bigArray[4] + ... + bigArray[998].
        // Print this sum once it's computed.




        // STEP 5: Write a similar loop that sums up all the elements of 
        //  bigArray that are at odd indexes. Print this sum.




        // STEP 6: Write a *single* array-traversal loop that computes both
        //  sums (sum of all even-indexed and the sum of all odd-indexed
        //  values). Print these sums. Do they match the sums from above?
        // Hint: for each index i, test to see if it's even or odd. Based
        //  on this, add bigArray[i] into the appropriate sum.



    } // end main

} // end class

