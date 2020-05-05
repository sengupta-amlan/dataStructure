public class RecursionNew {
    public static void main(String[] args) {
        int ans=sum(12345);
        System.out.println(ans);
    }

    static int sum(int num)
    {
        if (num != 0)
        {
            return (num % 10 + sum (num / 10));
        }
        else
        {
            return 0;
        }
    }
}
