public class CharacterPairRecursion {
    public void main(String[] args) {
        //the answers are as follows
        //axa 1
        //axax 2
        //axbx 1
        //axaxax 4
        String s=new String("axaxax");
        int res=recursion(s);
        System.out.println(res);
    }

    public int recursion(String str){
        if(str.length()<3){
            return 0;
        }
        else{
            return ((str.charAt(str.length()-3)==str.charAt(str.length()-1))?1:0)+recursion(str.substring(0,str.length()-1));
        }
    }
}
