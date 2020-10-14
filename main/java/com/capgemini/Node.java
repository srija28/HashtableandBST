package com.capgemini;


public class Node<K> implements INode<K>{
	private K key;
	private INode next;
	
	public Node(K key) {
		this.key = key;
		this.next=null;
	}
	
	
	@Override
	public void setKey(K key) {
		this.key = key;
	}
	
	public INode getNext() {
		return next;
	}
	public void setNext(INode next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	
}
