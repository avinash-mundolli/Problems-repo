public class PalindromeNumber {
    public static void main(String[] args) {
        int num1=1234321;
        int num=num1;
        int sum=0;
        while(num>0){
            sum=sum*10+num%10;
            num=num/10;
        }
        if(num1==sum){
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
