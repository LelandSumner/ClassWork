public class Expressions {

    public static void main(String[] args) {
        System.out.println("=== Simple Arithmetic with Ints");
        System.out.println(" 12 - 2 - 3  \t= " + ( 12 - 2 - 3));
        System.out.println(" 6/2 + 7/3  \t= " + ( 6/2 + 7/3));
        System.out.println(" 22 + 4 * 2  \t= " + ( 22 + 4 * 2));
        System.out.println(" 3 * 4+2 * 3  \t= " + ( 3 * 4+2 * 3));
        System.out.println(" 8 * 2 - 7/4  \t= " + ( 8 * 2 - 7/4));
        System.out.println("=== Integer Division and 'Mod'");
        System.out.println(" 14 / 3  \t= " + ( 14 / 3));
        System.out.println(" 14 % 3  \t= " + ( 14 % 3));
        System.out.println(" ((14 / 3) * 3) + (14 % 3)  \t= " + ( ((14 / 3) * 3) + (14 % 3)));
        System.out.println(" (217 / 23 * 23) + (217 % 23)  \t= " + ( (217 / 23 * 23) + (217 % 23)));
        System.out.println(" 9 % 12  \t= " + ( 9 % 12));
        System.out.println(" 21 % 12  \t= " + ( 21 % 12));
        System.out.println(" 33 % 12  \t= " + ( 33 % 12));
        System.out.println("=== Arithmetic with Doubles and Ints");
        System.out.println(" 10.0 / 2  \t= " + ( 10.0 / 2));
        System.out.println(" 10 / 2.0  \t= " + ( 10 / 2.0));
        System.out.println(" 10.0 / 3  \t= " + ( 10.0 / 3));
        System.out.println(" 10 / 3.0  \t= " + ( 10 / 3.0));
        System.out.println(" 10.0 / 2 / 4  \t= " + ( 10.0 / 2 / 4));
        System.out.println(" (2.5 + 3.5)/2  \t= " + ( (2.5 + 3.5)/2));
        System.out.println(" 4 * 3/8 + 2.5 * 2  \t= " + ( 4 * 3/8 + 2.5 * 2));
        System.out.println("=== Mixing Strings with Numbers");
        System.out.println(" \"2 + 2 \" + 3 + 4.0  \t= " + ( "2 + 2 " + 3 + 4.0));
        System.out.println(" \"hello 34 \" + 2 * 4  \t= " + ( "hello 34 " + 2 * 4));
        System.out.println(" 3 + 4.0 + \" 2 + 2\"  \t= " + ( 3 + 4.0 + " 2 + 2"));
        System.out.println("=== More with Mod (see the patterns?)");
        System.out.println(" 26 % 10  \t= " + ( 26 % 10));
        System.out.println(" 26 / 10  \t= " + ( 26 / 10));
        System.out.println(" 317 % 10  \t= " + ( 317 % 10));
        System.out.println(" 317 / 10  \t= " + ( 317 / 10));
        System.out.println(" 5248 % 100 / 10  \t= " + ( 5248 % 100 / 10));
        System.out.println(" 5248 / 10 % 10  \t= " + ( 5248 / 10 % 10));
        System.out.println(" 5248 / 100 % 10  \t= " + ( 5248 / 100 % 10));
    }

} // end class
