public class recursionStringPermute {
    public static void main(String[] args) {
        String s = "abcdpqrs";
        // System.out.println(s.length())->8
        int len = s.length();
        String ans = "";
        String res= "";
        while (len > 0) {
            int i=0;
            System.out.println(res);
            res=ans.concat(Character.toString(s.charAt(s.length() - 1-i)));
            len--;
            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println(res);
    }
}
