package CompanyProblems;
class Node{
	char data;
	Node next;
	Node(char data){
		this.data=data;
		this.next=null;
	}
}
 
public class CheckPalindromeInLinkedList {
	static boolean IsPali(Node head) {
		if(head==null)return true;
		int n=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			n++;
		}
		if(n==1)return true;
		int count=0;
		int half=n/2;
		temp=head;
		Node prev=null;
		Node following;
		
		while(count<half) {   
			 following =temp.next;
			 temp.next=prev;
			 prev=temp;
			
			
			 temp=following;
			
			
			count++;
		}
		if(n%2!=0) {
			temp=temp.next;
		}
		while(prev!=null && temp!=null) {
			if(prev.data!=temp.data)return false;
			prev=prev.next;
			temp=temp.next;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node('l');
		head.next=new Node('e');
		head.next.next=new Node('e');
		head.next.next.next=new Node('l');
//		head.next.next.next.next=new Node('l');
		System.out.print(IsPali(head));
		

	}

}
