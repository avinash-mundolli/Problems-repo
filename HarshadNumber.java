public class HarshadNumber {
    public static void main(String[] args) {
        int num=21,num2=num;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(num2%sum==0?"is HarshadNumber":" not HarshadNumber");
    }
}
