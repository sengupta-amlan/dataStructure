public class RecursionTriangle {
    public static void main(String[] args) {
        //triangle(0) ->0
        //triangle(1) ->1
        //triangle(2) ->3
        //triangle(3) ->6
        //triangle(4) ->10
        int res=triangle(4);
        System.out.println(res);
    }

    public static int triangle(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+triangle(n-1);
        }
    }
}
