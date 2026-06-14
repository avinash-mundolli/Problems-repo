public class StrongNumber {
    public static void main(String[] args) {
        int n=146,n1=n;
        int sum=0;
        while(n!=0){
            sum=sum+fact(n%10);
            n/=10;
        }
        System.out.println(sum==n1?" is Strong number":" not strong number");
        
    }
    public static int fact(int n){
            int fact=1;
            for(int i=2;i<=n;i++){
                fact=fact*i;
            }
            return fact;
        }
}
