public class SumOfTwoPrimes {
    public static void main(String[] args) {
        int num=34;
        int j=num-1;
        for(int i=1;i<=num/2;i++){
            if(isPrime(i)&&isPrime(j)){
                System.out.println(i+" "+j);
            }
            j--;
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
