package cn.liuhanlin.chapterOne.basic;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(2.0/0.0);
        System.out.println(Double.MAX_VALUE);
        System.out.println((-14) % 3);
        System.out.println(-14 - (-14/3)*3);
        System.out.println(14 % (-3));
        System.out.println(14 - (14/(-3))*(-3));
        System.out.println(2.0e-6*100000000.1);
        System.out.println(2.0e-6);
        fun(1,1,1);
        fun(2,1,1);
        fun(2,3,3);
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.print(f+" ,");
            f = f + g;
            g = f - g;
        }
        System.out.println();
        System.out.println(9.0/1.0);
        System.out.println(0.001 ==.001);
        double t = 9.0;
        while (Math.abs(t-9.0/t) > .001){
            t = (9.0/t + t)/2.0;
        }
        System.out.printf("%.5f\n",t);
        int sum = 0;
        for (int i = 1; i < 1000 ;i++)
            for (int i1 = 0; i1 < i; i1++) {
                sum++;
            }
        System.out.println(sum);
        sum = 0;
        int temp = 0;
        for (int i = 1; i < 1000; i *= 2) {
            System.out.print(i+"  ");
            for (int i1 = 0; i1 < 1000; i1++) {
                temp++;
                sum++;
            }
            //System.out.println("temp "+ temp);
            temp = 0;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println('b'+'c');
        System.out.println((char)('a'+4));
        System.out.println(Integer.toBinaryString(99));
        fun2(99);
        //fun3();
        //fun4();
        int[][] arr ={{3,2,1,10},{4,9,6,10},{10,8,9,99}};

        int[][] arr2 = arrRev(arr, arr.length, arr[0].length);
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%5d",anInt);
            }
            System.out.println();
        }
        System.out.println("================");
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.printf("%5d",anInt);
            }
            System.out.println();
        }
    }
    public static void fun(int a,int b, int c){

        if (a == b && a==c){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
    public static void fun2(int i){
        StringBuilder sb = new StringBuilder();
        int b;
        while (i > 2){
            b = i % 2;
            i /= 2;
            sb.insert(0,b);
        }
        sb.insert(0,i);
        System.out.println(sb.toString());

    }
    public static void fun3(){
        boolean[][] arr = new boolean[3][4];
        arr = new boolean[][]{{true, false, true, false}, {false, false, true, true}, {true, false, true, true}};
        for (int j = 0; j <= 4; j++){
            if (j>0){
                System.out.print(j-1+" ");
            }
            else System.out.print("  ");

        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < 4; j++) {
                if(arr[i][j]){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void fun4(){
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }

        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
    public static int[][] arrRev(int[][] arr,int m,int n){
        int[][] newArr = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newArr[j][i] = arr[i][j];
            }
        }
        return newArr;
    }
}
