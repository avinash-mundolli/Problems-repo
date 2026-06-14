public class DecimalToBinary {
    public static void main(String[] args) {
        int num=13;
        String sum="";
        while(num!=0){
            sum=(num%2)+sum;
            num/=2;
        }
        System.out.println(sum);
    }
}
