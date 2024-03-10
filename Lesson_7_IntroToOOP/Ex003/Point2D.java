package Lesson_7_IntroToOOP.Ex003;


/** 
 * Это точка 2D
*/
public class Point2D {
    private int x, y; // Это координата х и у

    /**
     * Это конструктор ...
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) { // конструктор с 2-мя аргументами
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
//        x = value;
//        y = value;
        this(value, value);
    }
    public Point2D() {  // () конструктор по умолчанию
//        x = 0;
//        y = 0;
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    
    private String getInfo(){   //  private (доступен только внутри этого класса),
                                // public (этим можем пользоваться откуда угодно)- модификаторы доступа
        return String.format("x: %d; y: %d", x, y);
    }
    @Override   // переопределение метода, который работает по умолчанию
    public String toString() {  // метод toString будет возвращать getInfo()
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    // ctor
    // get; set;
    // docs
    //
}
