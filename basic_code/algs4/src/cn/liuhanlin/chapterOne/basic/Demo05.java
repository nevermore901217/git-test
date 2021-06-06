package cn.liuhanlin.chapterOne.basic;

import java.util.Arrays;

public class Demo05 {
    private static int count = 0;
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length-1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (key < a[mid]) hi = mid -1;
            else if (key > a[mid]) lo = mid+1;
            else return mid;
        }
        return -1;
    }
    public static int rank2(int key,int[] a,int start,int end){
        int lo = start;
        int hi = end;
        int mid = lo + (hi - lo)/2;
        count++;
        if (lo <= hi && a[mid] < key){
            return rank2(key, a,mid+1,hi);
        }else if (lo <= hi && a[mid] > key){
            return rank2(key, a,lo,mid-1);
        }else if (lo <= hi && a[mid] == key){
            return mid;
        }
        return -1;
    }
    public static int getGCD(int num1, int num2) {
        System.out.println("参数1:  "+num1+"  参数2:   "+num2);
        // 先获得绝对值，保证负数也可以求
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        // 先求余数，假定第一个数较大；如果第二个较大，在第二轮调用时会颠倒过来
        int remainder = num1 % num2;
        // 如果为 0，则直接得出
        if (remainder == 0) {
            return num2;
        }

        // 递归调用
        return getGCD(num2, remainder);
    }

    public static void main(String[] args) {
        int[] arr ={9,10,100,2002,55,32,77,1,999,888,10086,2000,2001,1999};
        //System.out.println(Arrays.toString(Arrays.copyOfRange(arr,3, arr.length)));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = rank(2000, arr);
        System.out.println(index);
        int index2 = rank2(2000, arr,0,arr.length-1);
        System.out.println(index2);
        System.out.println("递归次数 :"+count);
        int gcd = getGCD(1111111, 1234567);
        System.out.println(gcd);
    }
}
