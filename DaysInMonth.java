public class DaysInMonth {
    public static void main(String[] args) {
        int month=4,year=2004;
        int days=0;
        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                days=31;break;
            case 4:case 6:case 9:case 11:
                days=30;break;
                case 2:
                    days=(year%4==0&&year%100!=0)||(year%400==0)? 29:28;
            default:
                days=0;
        }
        System.out.println(days);
    }
}
