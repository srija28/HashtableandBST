package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		MyBinaryTree<Integer> binarySearchTree=new MyBinaryTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		
		int size=binarySearchTree.getSize();
		assertTrue(size==3);
	}
	
	@Test
	public void given13NumbersWhenAddedToBinaryTreeShouldReturnSizeThirteen() {
		MyBinaryTree<Integer> binarySearchTree=new MyBinaryTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(11);
		binarySearchTree.add(65);
		binarySearchTree.add(3);
		binarySearchTree.add(16);
		binarySearchTree.add(63);
		binarySearchTree.add(67);
		
		int size=binarySearchTree.getSize();
		Assert.assertEquals(13, size);
		//assertTrue(size==13);
	}
	
	@Test
	public void given13Numbers_ShouldSearch63InTheTreeAndReturnTheSame() {
		MyBinaryTree<Integer>  binarySearchTree = new MyBinaryTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(11);
		binarySearchTree.add(65);
		binarySearchTree.add(3);
		binarySearchTree.add(16);
		binarySearchTree.add(63);
		binarySearchTree.add(67);
		
		boolean result = binarySearchTree.searchRecursively(63);
		Assert.assertEquals(true, result);
		
		
	}
	
}