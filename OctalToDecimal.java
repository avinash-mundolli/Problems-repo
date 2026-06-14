public class OctalToDecimal {
    public static void main(String[] args) {
        int octal=157;
        int sum=0,power=0;
        while(octal!=0){
            sum+=octal%10*Math.pow(8, power);
            octal/=10;
            power++;
        }
        System.out.println(sum);
    }
}
//int decimal=Integer.parseInt(octal,8);