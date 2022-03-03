public static void ifElseMystery1(int x, int y) {
    int z = 4;
    if (z <= x) { 
        z = x + 1; 
    } else { 
        z = z + 9; 
    } 
    if (z <= y) { 
        y++; 
    } 
    System.out.println(z + " " + y); 
}


// What do you get for the following calls?

ifElseMystery1(3, 20); 	

ifElseMystery1(4, 5); 	

ifElseMystery1(5, 5); 	

ifElseMystery1(6, 10); 	
