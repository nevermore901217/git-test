package cn.liuhanlin.chapterOne.basic;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private class Node{
        T t;
        Node next;
    }
    private Node first;
    private int n;
    public boolean isEmpty(){
        return n == 0;
    }
    public int size(){
        return n;
    }
    public void push(T t){
        Node node = first;
        first = new Node();
        first.t = t;
        first.next = node;
        n++;
    }
    public T pop(){
        T t = first.t;
        first = first.next;
        n--;
        return t;
    }
    public T peak(){
        return first.t;

    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T t = current.t;
                current = current.next;
                return t;
            }
        };
    }
}
