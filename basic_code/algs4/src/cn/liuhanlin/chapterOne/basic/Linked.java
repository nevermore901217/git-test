package cn.liuhanlin.chapterOne.basic;

import java.util.Iterator;

public class Linked<T> implements Iterable<T>{
    public Node getFirst(){
        return first;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node node = first;
            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                T t = node.t;
                node = node.next;
                return t;
            }
        };
    }

    class Node{
        T t;
        Node next;
        public Node(T t,Node next){
            this.t = t;
            this.next = next;
        }
        public Node(T t){
            this(t,null);
        }
    }
    public Linked(){
        this.first = null;
        this.size = 0;
    }
    private Node first;
    private int size;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void addFirst(T t){
        Node node = new Node(t);
        node.next = first;
        first = node;
        size++;
    }
    public void addLast(T t){
        add(t,size);
    }
    public void add(T t,int index){
        if (index < 0 || index > size)
            throw new IllegalArgumentException("index is error!");
        if (index == 0){
            addFirst(t);
            return;
        }
        Node preNode = this.first;
        for (int i = 0; i < index - 1; i++) {
            preNode = preNode.next;
        }
        Node newNode = new Node(t);
        newNode.next = preNode.next;
        preNode.next = newNode;
        this.size++;

    }
    public void remove(T t){
        if (first == null){
            System.out.println("链表为空");
            return;
        }
        if (!isEmpty() && size >0){
            if (first.t.equals(t)){
                first = first.next;
                size--;
                return ;
            }
            Node preNode = this.first;
            for (int i = 0; i < size - 1; i++) {
                if (preNode.next.t.equals(t)){
                    preNode.next = preNode.next.next;
                    size--;

                }
                else {
                    preNode = preNode.next;
                }

            }
        }
    }
    public T removeFirst(){
        if (first == null){
            System.out.println("链表为空");
            return null;
        }
        Node node = first;
        first = first.next;
        node.next = null;
        size--;
        return node.t;
    }
    public T removeLast(){
        if (first == null){
            System.out.println("链表为空");
            return null;
        }
        if (size == 1){
            Node node =first;
            first = null;
            size--;
            return node.t;
        }
        Node cur = first;
        Node pre = first;
        while (cur.next != null){
            pre = cur;
            cur = cur.next;
        }
        pre.next = null;
        cur.next = null;
        size--;
        return cur.t;
    }
    public boolean contains(T t){
        Node cur = first;
        while (cur.next!=null){
            if (cur.t.equals(t)){
                return true;
            }
            else cur = cur.next;
        }
        return false;
    }
}
