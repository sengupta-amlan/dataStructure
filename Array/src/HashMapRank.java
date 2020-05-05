import java.util.HashMap;

public class HashMapRank {
    public static void main(String[] args){
        int[] arr=new int[]{100,90,90,80,75,60};
        hashing(arr);
    }

    public static void hashing(int[] scores)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i+1<=scores.length;i++){
            if(scores[i]!=scores[i+1]){
                map.put(scores[i],rank);
            }else{
                map.put(scores[i],rank++);
            }
        }
        System.out.println(map);
    }
}
