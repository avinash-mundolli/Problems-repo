import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        Set<Integer> distinct=new HashSet<>();
        for(int x:arr){
            distinct.add(x);
        }
        System.out.println(distinct);
    }
}
