public class IsAlphabet {
    public static void main(String[] args) {
        char c='a';
        c=Character.toUpperCase(c);
        if(c>='A'&&c<='Z'){
            System.out.println(c+" is Alphabet");
        }else{
            System.out.println(c+" is not Alphabet");
        }
    }
}
