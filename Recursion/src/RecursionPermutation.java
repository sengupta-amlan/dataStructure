
//        bunnyEars(0) → 0
//        bunnyEars(1) → 2
//        bunnyEars(2) → 4
//        bunnyEars(3) -> 8

public class RecursionPermutation {
    public static void main(String[] args) {
        int res=bunny(5);
        System.out.println(res);
    }

    public static int bunny(int num){

            if (num == 0) {
                return 1;
            } else {
                return 2 * bunny(num - 1);
            }

    }
}

