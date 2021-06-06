package cn.liuhanlin.chapterOne.basic;

public class Demo06 {
    private static int count = 0;
    public static double binomial(int n,int k,double p){
        count++;
        //System.out.println("n= " + n + " k= " + k + " 次数：" + count);
        if (n==0 && k==0)
            return 1.0;
        if (n < 0 || k < 0 )
            return 0.0;
        return (1.0 - p) * binomial(n-1,k,p) + p * binomial(n-1,k-1,p);
    }
    public static double binomial2(int n,int k,double p){
        double[] arr = new double[100];
        if (n==0 && k==0)
            return 1.0;
        if (n < 0 || k < 0 )
            return 0.0;
        return (1.0 - p) * binomial(n-1,k,p) + p * binomial(n-1,k-1,p);
    }

    public static void main(String[] args) {
        double binomial = binomial(20, 10, 0.25);
        System.out.println(binomial);
    }
}
