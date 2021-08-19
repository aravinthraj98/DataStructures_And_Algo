package Practice;
class SingleLinkedList{
	int data;
	String s="";
	SingleLinkedList next;
	SingleLinkedList prev;
	SingleLinkedList(int num,String s){
		this.data=num;
		this.s=s;
	    
	}
}
public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList head= new SingleLinkedList(4,"aravinth");
		head.next=new SingleLinkedList(5,"arun");
		head.next.prev=head;
		SingleLinkedList temp =head;
		
		while(temp.next!=null) {
		  temp=temp.next;
		}
		while(temp.prev!=null) {
			
		}
		
		
		
	

	}

}
