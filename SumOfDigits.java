public class SumOfDigits {
    public static void main(String[] args) {
        int num=1235;
        int sum=0;
        while(num>0){
            sum=sum*10+num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
}
