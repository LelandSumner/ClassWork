public class Two {

    public static void main (String [] args) {
        // a)
	ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        // what next to get list =  3 -> 1 -> 2?
        list = new ListNode(3, list);
        printList(list);

        // b)
	list = new ListNode(1);
        list.next = new ListNode(2);
        ListNode temp = new ListNode(3, new ListNode(4));
        // what next to get list = 1 -> 3 -> 4 -> 2?
        temp.next.next = list.next;
        list.next = temp;
        printList(list);

        // c)
        list = new ListNode(5, new ListNode(4, new ListNode(3)));
        // what next to get list = 4 -> 5 -> 3?
        temp = list.next;
        list.next = temp.next;
        temp.next = list;
        list = temp;
	printList(list);

    }

    public static void printList(ListNode current) {
	while (current != null) {
	    System.out.print(current.data + " ");
            current = current.next;
	}
        System.out.println();
    }
}
