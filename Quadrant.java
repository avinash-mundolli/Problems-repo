public class Quadrant {
    public static void main(String[] args) {
        int x=12,y=-23;
        System.out.println(
            (x>0&&y>0)?"1st":
            (x<0&&y>0)?"2nd":
            (x<0&&y<0)?"3rd":
            (x>0&&y<0)?"4th":
            "origin");
    }
}
