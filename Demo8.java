import java.awt.Point;

public class Demo8 {
    public static void main(String[] args) {
       Point p = new Point(10, 20);
       updatePoints1(p);
       System.out.println(p);   // p [x=10, y=20]
       updatePoints2(p);
       System.out.println(p);   // p [x=20, y=30]
    }

    public static void updatePoints1(Point p){
        p = new Point(50, 50);
    }

    public static void updatePoints2(Point p){
        p.x = 20;
        p.y = 30;
    }

}
