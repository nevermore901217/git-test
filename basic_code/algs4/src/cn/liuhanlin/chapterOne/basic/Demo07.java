package cn.liuhanlin.chapterOne.basic;

public class Demo07 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
