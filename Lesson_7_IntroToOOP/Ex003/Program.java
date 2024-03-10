package Lesson_7_IntroToOOP.Ex003;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        // a.setX(12);                  // set (задать) - доступ к записи
        System.out.println(a.getX());   // get (получить) - доступ к чтению
        // Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(0);
        System.out.println(b);
        // Point2D b = new Point2D(0, 10);

        var dis = Point2D.distance(a, b);   // static
        System.out.println(dis);
    }
}
