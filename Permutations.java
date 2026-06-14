public class Permutations {
    public static void main(String[] args) {
        int n=8,r=3;
        int npr=1;
        for(int i=0;i<r;i++){
            npr=npr*(n-i);
        }
        System.out.println(npr);
    }
}
