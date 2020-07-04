package prac;

public class Prac20 {

	static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }
	
	static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode temp=head;
       DoublyLinkedListNode currentnode=new DoublyLinkedListNode(data);
       if(head.data>data)
           {
               currentnode.next=head;
               head=currentnode;
           }
       else
       {
       while(temp.next!=null && temp.data<data)
       {
           temp=temp.next;
       }
       if(temp.next==null && temp.data<data)
       {
           temp.next=currentnode;
           currentnode.prev=temp;
           return head;
       }
       else{
       currentnode.prev=temp.prev;
       currentnode.next=temp;
       currentnode.prev.next=currentnode;
       temp.prev=currentnode;
       }
       }
       return head;
   }
	
}
