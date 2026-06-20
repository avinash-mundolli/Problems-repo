public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int maxproduct=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=i;j<arr.length;j++){
                product=product*arr[j];
            }
            if(product>maxproduct){
                maxproduct=product;
            }
        }
        System.out.println(maxproduct);
    }
}
