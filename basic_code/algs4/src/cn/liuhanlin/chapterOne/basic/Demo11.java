package cn.liuhanlin.chapterOne.basic;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s1 = input.split(" ");
        for (String s : s1) {
            if (s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals(")")) {
                String val1 = vals.pop();
                String val2 = vals.pop();
                String expre = "(" + val2 + ops.pop() + val1 + ")";
                System.out.println("压栈"+expre);
                vals.push(expre);
            }
            else {
                vals.push(s);
                System.out.println("压栈"+s);
            }

        }

        System.out.println(vals.pop());
    }
}

