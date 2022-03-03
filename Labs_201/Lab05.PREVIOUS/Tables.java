public class Tables {

    public static void main(String[] args) {

        System.out.println("Hypotenuse lengths for right triangles with");
        System.out.println("sides as given in column and row headings:" );
        System.out.println(
                "      1      2      3      4      5      6      7      8");
        for (int sideA = 1; sideA <= 8; ++sideA) {
            System.out.print(sideA);
            for (int sideB = 1; sideB <= 8; ++sideB) {
                double hyp = Math.sqrt(sideA * sideA + sideB * sideB);
                System.out.print(hyp);
            }
            System.out.println();
        }
    }

} // end class