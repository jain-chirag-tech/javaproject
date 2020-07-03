package prac;

public class Prac17 {
	
	static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

	    int ACount =0;
	    int BCount =0;
	    SinglyLinkedListNode A=head1;
	    SinglyLinkedListNode B=head2;
	    while(A!=null){
	        ACount++;
	        A=A.next;
	    }
	    
	     while(B!=null){
	        BCount++;
	        B=B.next;
	    }
	    
	    int diff= Math.abs(ACount-BCount);
	    A=head1;
	    B=head2;
	    if(ACount>BCount){
	        while(diff>0){
	            A=A.next;
	            diff--;
	        }
	    }else{
	        while(diff>0){
	            B=B.next;
	            diff--;
	        }
	    }
	    
	    while(A!=B){
	        A=A.next;
	        B=B.next;
	    }
	    
	    return A.data;
	    }
	
}
