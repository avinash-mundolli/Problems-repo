public class GreatestOfThree {
    public static void main(String[] args) {
        int a=3,b=7,c=2;
        int greater;
        if(a>b&&a>c){
            greater=a;
        }else if(b>c){
            greater=b;
        }else{
            greater=c;
        }
        System.out.println(greater);
    }
}
