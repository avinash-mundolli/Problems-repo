
import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 5, 4, 3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        Integer[] temp=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp, new Comparator<Integer>() {
            @Override
            public int compare(Integer a,Integer b){
                if(map.get(a)!=map.get(b)){
                    return map.get(b)-map.get(a);
                }
                return a-b;
            }
        });
        for(int x:temp){
            System.out.print(x+" ");
        }

    }
}
