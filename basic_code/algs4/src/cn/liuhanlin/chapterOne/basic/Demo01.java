package cn.liuhanlin.chapterOne.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        String s;
        while ((s =  sc.nextLine())!=""){
            sum += Double.parseDouble(s);
            cnt++;
        }
        double avg = sum / cnt;
        System.out.printf("Average is %.5f\n" , avg);
    }
}
