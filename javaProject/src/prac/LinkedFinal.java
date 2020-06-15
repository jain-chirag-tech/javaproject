package prac;

public class LinkedFinal {

	public static void main(String[] args) {
		
		PracLinkedList llist = new PracLinkedList();

        llist.add(12);
		llist.add(7);
	    llist.add(18);
		llist.add(3);
		llist.add(24);
		llist.add(30);
		llist.add(11);
		
		llist.print();
		llist.insert(100, 3);
		System.out.println();
		llist.print();
		System.out.println();
		llist.delete(6);
		llist.print();		
	}

}
