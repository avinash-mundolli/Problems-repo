public class Demo {
    public static void main(String[] args) {
      int s=10,e=100;
      for(int i=s;i<=e;i++){
        if(isPrime(i)){
          System.out.print(i+" ");
        }
      }

  }

  public static boolean isPrime(int n){
    if(n<=1){
      return false;
    }
    else{
      for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
          return false;
        }
      }
    }
    return true;
  }
}

