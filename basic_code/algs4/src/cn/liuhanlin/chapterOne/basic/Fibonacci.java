package cn.liuhanlin.chapterOne.basic;

import java.util.Scanner;

public class Fibonacci {
    public static long fun(int n){
        if (n == 0) return 1;
        if (n == 1) return 1;
        return fun(n-1)+fun(n-2);
    }
    public static long[] fun2(int n){
        long[] arr = new long[n+1];
        if (n == 0){
            arr[n] = 1;
        }else if (n == 1){
            arr[0] = 1;
            arr[1] = 1;
        }else if (n >1){
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }
    public static int factorial(int i){
        if (i == 0 || i ==1)
            return 1;
        return factorial(i - 1) * i;
    }
    public static void main(String[] args) {
       /* long[] longs = fun2(90);
        for (long aLong : longs) {
            System.out.println(aLong);
        }*/
        System.out.println(factorial(0));
        System.out.println(Math.log(factorial(0)));
        Scanner scanner = new Scanner(System.in);
        String s;
        while ((s = scanner.nextLine())!=""){
            String[] s1 = s.trim().split(" ");
            System.out.printf("%s的命中率为:%.3f",s1[0],Double.parseDouble(s1[1])/Double.parseDouble(s1[2]));
            System.out.println();
        }
    }
}
