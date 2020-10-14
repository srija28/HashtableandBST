package com.capgemini;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAddedTOTheList_ShouldReturn_Paranoid_Frequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myMap.getKey(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myMap.add(word, value);
		}

		int frequency = myMap.getKey("paranoid");
		System.out.println(myMap);
		Assert.assertEquals(3, frequency);
	}
	
	@Test
	public void givenAWord_ShouldRemoveThatFromTheMap() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myMap.getKey(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myMap.add(word, value);
		}
		myMap.removeElement("avoidable");
		System.out.println(myMap.toString());
		Assert.assertEquals(null, myMap.getKey("avoidable"));

	}

}