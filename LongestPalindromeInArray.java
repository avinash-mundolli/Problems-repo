public class LongestPalindromeInArray {
    public static void main(String[] args) {
        int[] arr = {121, 45, 1331, 789, 12321, 55};
        int longest=-1;
        for(int x:arr){
            if(isPalindrome(x)&&x>longest){
                longest=x;
            }
        }
        System.out.println(longest);
    }
    private static boolean isPalindrome(int i) {
        int x=i,sum=0;
        while(x!=0){
            sum=sum*10+x%10;
            x=x/10;
        }
        return i==sum;
    }
}
