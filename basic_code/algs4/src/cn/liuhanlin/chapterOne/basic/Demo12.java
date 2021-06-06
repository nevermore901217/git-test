package cn.liuhanlin.chapterOne.basic;

public class Demo12<T> {
    private Node frist;
    private class Node{
        T t;
        Node next;
    }

    public static void main(String[] args) {
        Demo12<String> d = new Demo12<>();

    }
}
