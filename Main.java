package linked_ListDoyo;

public class Main {

	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);

		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n6);

		if (hasLoop(n1)) {
			System.out.println("Loop detected!");
		} else {
			System.out.println("No Loop detected!");
			listNodes(n1);
		}

	}
	
	public static void listNodes(Node n){
		Node currentNode = n;
		while(currentNode != null){
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}
	
	public static boolean hasLoop(Node n){
		Node slow = n;
		Node fast = n;
		
		while(fast != null){
			System.out.println("whiley");
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			
			if(slow == fast){
				System.out.println("true");
				return true;
			}
		}
		return false;
	}

}
