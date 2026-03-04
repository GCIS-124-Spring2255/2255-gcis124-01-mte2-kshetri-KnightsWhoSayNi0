// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;

public class MyDeque<E> implements Deque<E> {
    
    /*
     * You may use the data structure of your choice, including those provided
     * to you in this repository and the JCF implementations of the data 
     * structures introduced in our units 5 and 6
     * 
     * so I can just use the linked list we were given, right?
     */

    private final LinkedList<E> list;

    public MyDeque() {
        list = new LinkedList<>();
    }

    @Override
    public void enqueueFront(E element) {
        list.addFirst(element);
    }

    @Override
    public void enqueueBack(E element) {
        list.addLast(element);
    }

    @Override
    public E dequeueFront() {
        return list.pollFirst();
    }

    @Override
    public E dequeueBack() {
        return list.pollLast();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    public static void main(String[] args) { 

        // ...
    }
}