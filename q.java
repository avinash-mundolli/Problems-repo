public class q{
    public static void main(String[] args) {
        int[] arr={2,3,4,4,5,7,9,11,12,15};
        int count=0;
        for(int i=0;i<arr.length-1;){
            if(arr[i+1]-arr[i]==1){
                count++;
                i=i+2;
            }else{
                i++;
            }

        }
        System.out.println(count);
    }
}