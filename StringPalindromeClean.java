public class StringPalindromeClean{
    public static void main(String[] args) {
        String str= "Ma%d&a*M";
        if(isPalindrome(str)){
            System.out.println("is Plaindrome");
        }else{
            System.out.println("is not palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String clean=sb.toString();
        String reverse=new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }
}