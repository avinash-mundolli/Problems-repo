public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int totalsum=0;
        for(int x:arr){
            totalsum+=x;
        }
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum-=arr[i];
            if(leftsum==totalsum){
                System.out.println("equlibrium index: "+i);
                return;
            }
            leftsum+=arr[i];
        }
        System.out.println("equilibrium index not found");
    }
}
