public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[j]=arr[i];
            j++;
        }
        for(int x:arr1){
            System.out.print(x+" ");
        }
    }
}
