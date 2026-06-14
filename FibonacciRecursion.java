public class FibonacciRecursion{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(fibonacchi(i)+" ");
        }
    }

    private static int fibonacchi(int i) {
       if(i<=1){
        return i;
       }
       return fibonacchi(i-1)+fibonacchi(i-2);
    }
}