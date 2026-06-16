public class LargestInArray {
    public static void main(String[] args) {
        int arr[] = {5, 10, 7, 8};
        int max=arr[0];
        int min=arr[0];
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            if(arr[i]>max2&&arr[i]!=max){
                max2=arr[i];
            }
            if(arr[i]<min){
                min2=min;
                min=arr[i];
            }
            if(arr[i]>min&&arr[i]<min2){
                min2=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(max2);
        System.out.println(min);
        System.out.println(min2);
    }
}
