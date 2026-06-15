public class DigitFrequency {
    public static void main(String[] args) {
        int num=223222332;
        int count=2;
        int i=0;
        while(num!=0){
            int last=num%10;
            if(last==count){
                i++;
            }
            num/=10;
        }
        System.out.println(i);

    }
}
