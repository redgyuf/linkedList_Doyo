package linked_ListDoyo;

public class Node {
	public int Data;
	public Node next;

	public Node(int data) {
		super();
		Data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return Data;
	}

	public boolean hasLoop() {
		return false;
	}

	public void listNodes() {

	}
}
