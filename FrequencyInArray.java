public class FrequencyInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 2, 1, 1};
        int target=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
