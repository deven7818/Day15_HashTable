package com.hashtable;
/**
 * Interface
 */

public interface Node<K> {

	K getKey();

	void setKey(K key);

	void setNext(Node<K> next);

	Node<K> getNext();

}
