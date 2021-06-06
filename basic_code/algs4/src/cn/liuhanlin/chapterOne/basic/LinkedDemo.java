package cn.liuhanlin.chapterOne.basic;

public class LinkedDemo {
    public static void main(String[] args) {
        Linked<String> linked = new Linked<>();
        linked.addLast("a");
        linked.addLast("b");
        linked.addLast("c");
        linked.addLast("d");
        linked.addLast("d");
        linked.addLast("e");
        System.out.println(linked.contains("d"));
        System.out.println();
        Linked<String>.Node first = linked.getFirst();
        Linked<Integer> linkedInteger = new Linked<>();
        linkedInteger.addLast(1);
        linkedInteger.addLast(100);
        linkedInteger.addLast(43);
        linkedInteger.addLast(665);
        linkedInteger.addLast(90);
        linkedInteger.addLast(300);
        System.out.println(max2(linkedInteger.getFirst()));
    }
    public static int max(Linked<Integer>.Node first){
        if (first == null){
            return 0;
        }
        else {
            int max = first.t;
            while (first != null){
                if (first.t > max){
                    max = first.t;
                }
                first = first.next;
            }
            return max;
        }
    }
    public static int max2(Linked<Integer>.Node first){

        if (first == null){
            return 0;
        }
        else if (first.next==null){
            return first.t;
        }else {
            int i = max2(first.next);
            return i > first.t ? i: first.t;
        }
    }
}
