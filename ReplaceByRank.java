
import java.util.*;

public class ReplaceByRank {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 3, 5};
        int[] sorted= arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(sorted[i], i+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

    }
}
