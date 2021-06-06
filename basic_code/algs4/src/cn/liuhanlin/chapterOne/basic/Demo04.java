package cn.liuhanlin.chapterOne.basic;

public class Demo04 {
    public static void main(String[] args) {
        double lg = lg(3);
        System.out.println(lg);
        int[] arr1 = {0,2,4,3,6,2,4,4,0,1,5,7,9,8,1};
        showArr(arr1);
        int[] arr2 = histogram(arr1,10);
        showArr(arr2);
        String s = exR1(6);
        System.out.println(s);
        int mystery1 = mystery(2, 25);
        int mystery2 = mystery(3, 11);
        System.out.println(mystery1);
        System.out.println(mystery2);
        mystery1 = mystery2(2, 25);
        mystery2 = mystery2(3, 11);
        System.out.println(mystery1);
        System.out.println(mystery2);
    }
    public static double lg(int n){
        return Math.log(n)/Math.log(2);
    }
    public static int[] histogram(int[] a,int m){
        int[] arr = new int[m];
        int count;
        for (int i = 0; i <a.length; i++) {
            count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i)
                    count++;
            }
            if (i < arr.length){
                arr[i] = count;
            }
        }
        return arr;
    }
    public static void showArr(int[] a){
        for (int i : a) {
            System.out.printf("%5d",i);
        }
        System.out.println();
    }
    public static String exR1(int n){
        if (n <=0)
            return "";
        else {
            return exR1(n-3) + n + exR1(n-2) + n;
        }
    }
    public static int mystery(int a,int b){
        if (b == 0){
            return 0;
        }
        if (b % 2 == 0){
            return mystery(a+a , b/2);
        }
        return mystery(a+a , b/2)+a;
    }
    public static int mystery2(int a,int b){
        if (b == 0){
            return 1;
        }
        if (b % 2 == 0){
            return mystery2(a*a , b/2);
        }
        return mystery2(a*a , b/2)*a;
    }
}
