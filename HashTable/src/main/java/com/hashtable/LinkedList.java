package com.hashtable;


public class LinkedList<K> {

	private Node<K> head;
	private Node<K> tail;

	public Node<K> search(K key) {
		Node<K> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	public void append(Node<K> myNode) {

		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	/**
	 * Remove
	 *
	public void remove(){
		
		Hashtable<String, Integer> hashtable = new Hashtable<String , Integer>();
		//String returned_value = (String)hashtable.remove(avoidable);
		System.out.println();
	}
	*/
	@Override
	public String toString() {
		return "\n Nodes {" + head + "}";
	}
	

	public void printMyNodes() {
		System.out.println(" My Nodes :" + head);
	}
	
	
}
