public class MysteryReturn {
    public static void main (String [] args) {
	int x = 1;
	int y = 2;
	int z = 3;

	// Statement 1
	z = mystery(x, z, y);
	// Statement 2
	System.out.println(x + " " + y + " " + z);
	// Statement 3
	x = mystery(z, z, x);
	// Statement 4
	System.out.println(x + " " + y + " " + z);
	// Statement 5
	y = mystery(y, y, z);
	// Statement 6
	System.out.println(x + " " + y + " " + z);
    }

    public static int mystery(int z, int x, int y) {
	z--;
	x = 2 * y + z;
	y = x - 1;
	System.out.println(y + " " + z);
	return x;
    }


}
