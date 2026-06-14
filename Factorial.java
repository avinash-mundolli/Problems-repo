
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n=100;
        BigInteger fact=BigInteger.ONE;
        for(int i=2;i<n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
