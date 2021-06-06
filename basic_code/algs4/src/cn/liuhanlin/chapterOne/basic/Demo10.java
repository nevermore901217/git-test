package cn.liuhanlin.chapterOne.basic;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s1 = input.split(" ");
        for (String s : s1) {
            if (s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                Double v = vals.pop();
                if (op.equals("+")) v = vals.pop()+v;
                else if(op.equals("-")) v = vals.pop() - v;
                else if(op.equals("*")) v = vals.pop() * v;
                else if(op.equals("/")) v = vals.pop() / v;
                else if(op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}

