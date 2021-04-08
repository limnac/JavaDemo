public class Recur {
    public int fib(int n){
        if(n==1||n==2) return 1;
        return fib(n-1)+fib(n-2);
    }
    public int fib2(int n){
        int a=1;
        int b=1;
        while(n>1){
            b += a;
            a = b-a;
        }
        return a;
    }
    public int fac(int n){
        if(n==1) return 1;
        return n*fac(n-1);
    }
    public int fac2(int n){
        int res = 1;
        for(int i= 1;i<=n;i++) res *= i;
        return res;
    }
}
