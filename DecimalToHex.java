public class DecimalToHex {
    public static void main(String[] args) {
        int num=31;
        String hexa=Integer.toHexString(num).toUpperCase();
        System.out.println(hexa);
        int hex=Integer.toOctalString(num);
    }
}
