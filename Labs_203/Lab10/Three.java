import java.util.*;

public class Three {

    public static void main (String [] args) {

        ListNode list = generateRandom(15, 25);
	printList(list);
	addAtEnd(list, 999);
	printList(list);
	System.out.println();

	list = generateRandom(15, 25);
	printList(list);
	makeAll(list, 99);
	printList(list);
	System.out.println();

	list = generateRandom(4, 12);
	printList(list);
	setLast(list, 999);
	printList(list);
	System.out.println();

    }

    public static ListNode generateRandom(int first, int last) {

        Random rand = new Random();
        // generate a random length from first to last
        int listLength = rand.nextInt(last-first+1) + first;
        // make a linked list of this length filled with values 1 to listLength
        ListNode list = null;
        for (int i = listLength; i > 0; i--) {
	    list = new ListNode(i, list);
	}
        return list;
    }

    public static void printList(ListNode current) {
	while (current != null) {
	    System.out.print(current.data + " ");
            current = current.next;
	}
        System.out.println();
    }
    public static void addAtEnd(ListNode list, int add){
        while (list.next != null) 
            list = list.next;
        list.next = new ListNode(add);
    }
    public static void makeAll(ListNode list, int make){
        while (list != null) {
            list.data = make;
            list = list.next;
        }
            
    }
    public static void setLast(ListNode list, int set){
        while (list.next != null) {
            list = list.next;
        }
        list.data = set;
            
    }
}
