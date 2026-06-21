
import java.util.HashSet;

public class SubsetArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4};
        boolean isSubset=true;
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr1){
            set.add(x);
        }
       for(int y:arr2){
        if(!set.contains(y)){
            isSubset=false;
            break;
        }
       }
        System.out.println(isSubset);
    }
}
