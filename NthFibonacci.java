public class NthFibonacci {
    public static void main(String[] args) {
        int n=7,a=0, b=1;
        int d=n-2;
        int sum=0;
        //System.out.print(a+" "+b+" ");
        while(d!=0){
            sum=a+b;
            a=b;
            b=sum;
            d--;
            
        }
        System.out.print(sum+" ");

    }
}