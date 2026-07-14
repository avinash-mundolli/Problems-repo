public class SumNNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum=0;
        for(int x:numbers){
            sum+=x;
        }
        System.out.println(sum);
    }
}
