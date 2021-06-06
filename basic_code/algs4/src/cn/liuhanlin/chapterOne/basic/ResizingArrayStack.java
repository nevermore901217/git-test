package cn.liuhanlin.chapterOne.basic;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T>{
    private T[] a = (T[]) new Object[1];
    private int n = 0;
    public boolean isEmpty(){
        return n == 0;
    }
    public int size(){
        return n;
    }
    private void resize(int max){
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
    public void push(T t){
        if (n == a.length){
            resize(2*a.length);
        }
        a[n++] = t;
    }
    public T pop(){
        T t = a[--n];
        a[n] = null;
        if (n >0 && a.length == a.length/4){
            resize(a.length/2);
        }
        return t;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i = n;
            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                return a[--i];
            }
        };
    }
}
