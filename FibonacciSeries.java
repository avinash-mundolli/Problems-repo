public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10,a=0, b=1;
        int sum=0;
        System.out.print(a+" "+b+" ");
        while(n!=0){
            sum=a+b;
            a=b;
            b=sum;
            n--;
            System.out.print(sum+" ");
        }

    }
}
