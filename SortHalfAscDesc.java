public class SortHalfAscDesc {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3, 7, 4};
        int mid=arr.length/2;
        for(int i=0;i<mid-1;i++){
            for(int j=i+1;j<mid;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=mid+1;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for( int x:arr){
            System.out.print(x+" ");
        }
    }
}
