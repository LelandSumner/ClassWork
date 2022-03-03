public class PlayingCard {

    public static void main (String [] args) {

	// write your code below and then enter the following
	// rank-suit pairs
	// 9 S
	// 2 H
	// 6 C
	// J D
	// Q S
	// 10 C
	// K H
	// A D
            System.out.print("Enter a card: ");
	    Scanner sc = new Scanner(System.in);
	    char rank = sc.next().charAt(0);
	    char suit = sc.next().charAt(0);

	    if (rank == '2')
	        System.out.print("Two");
	    else if (rank == '3')
	        System.out.print("Three");
	    else if (rank == '4')
	        System.out.print("Four");
	    else if (rank == '5')
	        System.out.print("Five");
	    else if (rank == '6')
	        System.out.print("Six");
	    else if (rank == '7')
	        System.out.print("Seven");
	    else if (rank == '8')
	        System.out.print("Eight");
	    else if (rank == '9')
	        System.out.print("Nine");
	    else if (rank == '1')
	        System.out.print("Ten");
	    else if (rank == 'J')
	        System.out.print("Jack");
	    else if (rank == 'Q')
	        System.out.print("Queen");
	    else if (rank == 'K')
	        System.out.print("King");
	    else
	        System.out.print("Ace");

	    System.out.print(" of ");
	        
	    if (suit == 'S')
	        System.out.println("Spades");
	    else if (suit == 'C')
	        System.out.println("Clubs");
	    else if (suit == 'D')
	        System.out.println("Diamonds");
	    else
	        System.out.println("Hearts");
    }
}