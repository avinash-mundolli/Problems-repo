public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        int num=1036210;
        int sum=0,place=1;
        while(num!=0){
            int last=num%10;
            if(last==0){
                last=1;
            }
            sum=last*place+sum;
            place*=10;
            num/=10;
        }
        System.out.println(sum);
    }
}
