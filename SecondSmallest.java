public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,4,3};
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min2=min;
                min=arr[i];
            }
            if(arr[i]>min&&arr[i]>min2){
                min2=arr[i];
            }
        }
        System.out.print(min2);
    }
}
