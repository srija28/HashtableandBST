package com.capgemini;

public class MyBinaryTree<K extends Comparable<K>> {
	
	private MyBinaryNode<K> root;
	private MyBinaryNode<K> searchedNode;
	private MyBinaryNode<K> tempNode;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	public boolean searchRecursively(K key) {

		if (tempNode == null)
			return false;
		int result = tempNode.key.compareTo(key);
		if (result == 0) {
			return true;
		} else if (result < 0) {
			tempNode = root.right;
			return searchRecursively(key);
		} else {
			tempNode = tempNode.left;
			return searchRecursively(key);
		}
	}
	
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	
	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ?0:1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

}
