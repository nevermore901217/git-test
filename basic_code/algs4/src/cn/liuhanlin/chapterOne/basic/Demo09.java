package cn.liuhanlin.chapterOne.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> stack = new Stack<>();
        String[] split = s.split("");
        boolean flag = false;
        for (String s1 : split) {
            if (s1.equals("{") ||s1.equals("[")  ||s1.equals("(")){
                //System.out.println(s1);
                stack.push(s1);
            }
            else {
                String temp = stack.pop();
                if ((s1.equals("}") && temp.equals("{"))||(s1.equals("]")  && temp.equals("["))||(s1.equals(")") && temp.equals("("))){
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);

    }
}
