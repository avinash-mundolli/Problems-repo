public class BinaryToOctal {
    public static void main(String[] args) {
        int n=10101;
        int sum=0,power=0;
        String str="";
        while(n!=0){
            sum+=n%10*Math.pow(2, power);
            n/=10;
            power++;
        }
        while(sum!=0){
            str=(sum%8)+str;
            sum/=8;
        }
        System.out.println(str);
    }
}
