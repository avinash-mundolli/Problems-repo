public class Demo {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        int count = 0;
        for(int i=0;i<arr.length-k+1;i++){
           if(i%2==0){
            count++;
           }

        }

        System.out.println(count);
    }
}
