public class PrimeRecursion {
    public static void main(String[] args) {
        int n=17;
        boolean result=isPrime(n,2);
        System.out.println(result);
    }
    public static boolean isPrime(int n,int i){
        if(n<=1) return false;
        if(n==2) return true;
        if(i*i>n) return true;
        return isPrime(n, i+1);

    }
}
