
import java.util.HashMap;


public class SortByOrderArray {
    public static void main(String[] args) {

        int[] arr1 = {2,1,2,5,7,1,9,3,6,8,8};
        int[] arr2 = {2,1,8,3};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr1){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int x:arr2){
            if(map.containsKey(x)){
                int freq=map.get(x);
                while(freq-->0){
                    System.out.print(x+" ");
                }
                map.remove(x);
            }
        }
        for(Integer key:map.keySet()){
            int ferq=map.get(key);
            while(ferq-->0){
                System.out.print(key+" ");
            }
        }
    }
}