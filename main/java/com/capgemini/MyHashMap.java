package com.capgemini;
import com.capgemini.MyLinkedList;
import com.capgemini.MyMapNode;

public class MyHashMap<K, V> {

	MyLinkedList<K> myList;

	public MyHashMap() {
		this.myList = new MyLinkedList<>();
	}


	public V get(K key) {		
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}
	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + myList + '}';
	}

}
