public class BinaryToDecimal {
    public static void main(String[] args) {
        int Binary=1011;
        int power=0,sum=0;
        while(Binary!=0){
            sum+=Binary%10*Math.pow(2, power);
            power++;
            Binary/=10;
        }
        System.out.println(sum);
    }
}
