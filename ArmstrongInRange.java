public class ArmstrongInRange {
    public static void main(String[] args) {
        int s=100,e=1000;
        
        for(int i=s;i<=e;i++){
            int sum=0;
            String str=Integer.toString(i);
            int n=str.length();
            int j=i;
            while(j!=0){
            sum=sum+(int)Math.pow(j%10, n);
            j/=10;
            }
            if(i==sum){
                System.out.println(i+" ");
            }
        }
    }
}
