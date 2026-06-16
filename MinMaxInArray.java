public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
