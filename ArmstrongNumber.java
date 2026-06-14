public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=370,num1=num;
        int sum=0;
        String str=Integer.toString(num);
        int n=str.length();
        while(num1!=0){
            sum=sum+(int)Math.pow(num1%10, n);
            num1/=10;
        }
        System.out.println(num==sum?" is armstrong":" not armstrong");
    }
}
