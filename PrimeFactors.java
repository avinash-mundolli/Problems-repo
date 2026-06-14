public class PrimeFactors {
    public static void main(String[] args) {
        int num=15;
        for(int i=1;i<=num;i++){
            if(num%i==0&&isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
