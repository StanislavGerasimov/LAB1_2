import java.util.Random;
public class Square {
    private double x1, x2, x3, x4; // координати x
    private double y1,y2,y3,y4; // координати y

    public double getY4() {
        return y4;
    }

    public double getX4() {
        return x4;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    public double getX1() {
        return x1;
    }

    public double getX3() {
        return x3;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    private double sideLength; // довжина сторони квадрата

    // Конструктор для створення квадрата з випадковими координатами та довжиною сторони
    public Square() {
        Random rand = new Random();
        this.x1 = (double)rand.nextInt(101); //* 100; // генеруємо випадкове число від 0 до 100
        this.y1 = (double)rand.nextInt(101);// * 100; // генеруємо випадкове число від 0 до 100
        this.sideLength = rand.nextInt(11)+1; //* 10; // генеруємо випадкове число від 0 до 10
        this.x2 = x1 + sideLength;
        this.y2 = y1;
        this.x3 = x2;
        this.y3 = y2+sideLength;
        this.x4 = x1;
        this.y4 = y1+sideLength;
    }

    // Конструктор для створення квадрата з заданими координатами та довжиною сторони
    public Square(double x1, double y1, double sideLength, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.sideLength = sideLength;
        this.x2 = x2;
        this.y2 = y2;
        this.x3=x3;
        this.y3=y3;
        this.x4=x4;
        this.y4=y4;
    }

    public boolean isSquare(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double side1 = distance(x1, y1, x2, y2);
        double side2 = distance(x2, y2, x3, y3);
        double side3 = distance(x3, y3, x4, y4);
        double side4 = distance(x4, y4, x1, y1);

        // Перевіряємо, чи рівні всі сторони
        return side1 == side2 && side2 == side3 && side3 == side4;
    }

    // Метод для обчислення відстані між двома точками
    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    // Метод для обчислення площі квадрата
    public double calculateArea() {
        return sideLength * sideLength;
    }

    // Метод для обчислення периметра квадрата
    public double calculatePerimeter() {
        return 4 * sideLength;
    }

    // Метод для виведення інформації про квадрат
    public void display() {
        System.out.println("Квадрат:");
        System.out.println("Координати: x1=" + x1+ ", y1="+y1 + ", x2="+x2+", y2="+y2+", x3="+x3+ ", y3="+y3+", x4="+x4+", y4="+y4);
        System.out.println("Довжина сторони: " + sideLength);
        System.out.println("Площа: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println();
    }
}
