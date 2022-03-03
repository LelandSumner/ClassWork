public class Mystery {

    public static void main (String [] args) {
     int [] numbers1 = {3, 7, 1, 0, 25, 4, 18, -1, 5};
     int [] numbers2, numbers3, numbers4;
     numbers2 = mystery(numbers1, 3, 1);
     numbers3 = mystery(numbers1, 5, 6);
     numbers4 = mystery(numbers1, 8, 4);
     print(numbers1);
     print(numbers2);
     print(numbers3);
     print(numbers4);       
    }

    public static int [] mystery(int[] data, int x, int y) {
        data[data[x]] = data[y];
        return data;
    }

    public static void print(int [] a) {
	for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
