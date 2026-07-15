public class Demo {
    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 8, 2, 9, 1};
        int k = 4;
        int count = 0;
        int count2=0;
            for( int i=0;i<k;i++){
                if(i%2==0){
                    count++;
                }
                if(count>k/2){
                    count2++;
                }
        }
    
        for(int i=k;i<arr.length;i++){
            if(arr[i-k]%2==0){
                count--;
            }else if(arr[i]%2==0){
                count++;
            }
            if(count>k/2){
                count2++;
            }
        }
        System.out.println(count2);
    }
}
