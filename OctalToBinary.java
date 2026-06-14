public class OctalToBinary {
    public static void main(String[] args) {
        int num=25,power=0,sum=0;
        String str="";
        while(num!=0){
            sum+=num%10*Math.pow(8, power);
            num/=10;
            power++;
        }
        while(sum!=0){
            str=sum%2+str;
            sum/=2;
        }
        System.out.println(str);
    }
}
