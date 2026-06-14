public class HCF {
    public static void main(String[] args) {
        int num1=36,num2=60;
        int max=0;
        int min=Math.min(num2, num2);
        for(int i=1;i<min;i++){
            if(num1%i==0&&num2%i==0){
                max=i;
            }
        }
        System.out.println(max);
    }
}
