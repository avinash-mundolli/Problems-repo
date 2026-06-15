public class AddFractions {
    public static void main(String[] args) {
        int num1=1,num2=3,den1=3,dec2=4;
        int num=num1*dec2+num2*den1;
        int den=dec2*den1;
        int min=Math.min(num, den);
        for(int i=2;i<=min;i++){
            if(num%i==0&&den%i==0){
                num=num/i;
                den=den/i;
            }
        }
        System.out.println(num+"/"+den);
    }
}
