import java.util.HashSet;
public class DisjointArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8,4};
        HashSet<Integer> set = new HashSet<>();
        boolean disjoint=true;
        for(int num:arr1){
            set.add(num);
        }
        for(int x:arr2){
            if(set.contains(x)){
                disjoint=false;
                break;
            }
        }
        System.out.println(disjoint);
    }
}