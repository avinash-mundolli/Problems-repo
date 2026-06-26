public class CountVowels {
    public static void main(String[] args) {
        String str="hello world";
        int count=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(isVowel(a)){
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}
