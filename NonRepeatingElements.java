
import java.util.HashSet;
import java.util.Set;


public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        int distinct=0;
        Set<Integer> set=new HashSet<>();
        for(int n:arr){
            if(!set.add(n)){
                set.remove(n);
            }
        }
        System.out.println(set);
    }
}
