// 0 1 1 2 3 5 8 13 21
public class fibonacci {
    public static void main(String[] args) {
        int res=fibo(9);
        System.out.println(res);
    }
    public static int fibo(int n){
        if(n<1){
            return -1;
        }
        else if(n==1 || n==2) {
            return n - 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
