public class DecimalToOctal {
    public static void main(String[] args) {
        int num=111;
        String str="";
        while(num!=0){
            str=(num%8)+str;
            num/=8;
        }
        System.out.println(str);
    }
}
