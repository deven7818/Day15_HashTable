package com.hashtable;

/**
 ** PROCEDURE
 * 1. Hash Map to find Frequency of Words in a sentence 
 * 2. Used Linked list for Hash Table Operation 
 *
 */


public class HashMapTestMain {
	
	public static void main(String[] args) {
		
		String string = "To be or not to be";
		String[] words = string.toLowerCase().split(" ");
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}
		System.out.println(hashMap);
	}
}