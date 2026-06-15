public class ExactlyXDivisors {
    public static void main(String[] args) {
        int start=1,end=50,x=5,y=0;
        for(int i=1;i<=end;i++){
            int result=factors(i);
            if(result==x){
                y++;
            }
        }
        System.out.println(y);
        
    }
    public static int factors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}
