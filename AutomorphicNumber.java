public class AutomorphicNumber {
    public static void main(String[] args) {
        int num=76,squr=num*num;
        boolean isok=true;
        while(num!=0){
            if(num%10!=squr%10){
                isok=false;
                break;
            }
            num/=10;
            squr/=10;
        }
        System.out.println(isok?" is AutomorphicNumber":" is not AutomorphicNumber");
    }
}
