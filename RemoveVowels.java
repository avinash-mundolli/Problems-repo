public class RemoveVowels {
    public static void main(String[] args) {
        String str="hello world";
        String result="";
        int count=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(!isVowel(a)){
                result+=a;
            }
        }
        System.out.println(result);
    }
    public static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}
