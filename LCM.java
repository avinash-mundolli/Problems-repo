public class LCM {
    public static void main(String[] args) {
        int num1=12,num2=18;
        int hcf=0;
        for(int i=1;i<Math.min(num1,num2);i++){
            if(num1%i==0&&num2%i==0){
                hcf=i;
            }
        }
        System.out.println(num1*num2/hcf);
    }
}
