public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                System.out.println();
            }
        }
    }
}
