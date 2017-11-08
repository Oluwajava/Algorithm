package com.company.stacks;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Mayokun on 10/31/2017.
 */
public class LInkedStack<E> extends Stack<E> {

    private LinkedList<E> list = new LinkedList<>();
    public LInkedStack() {}
    public int size() { return list.size(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public E push(E element) {
        list.addFirst(element);
        return element;
    }
    public E top() { return list.getFirst();}
    public E pop() { return list.removeFirst(); }

}
