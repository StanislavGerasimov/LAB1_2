import java.util.Random;

public class Square {
    private double x1, y1, x2, y2, x3, y3, x4, y4;

    // Конструктор, який приймає координати вершин квадрата
    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public double getY4() {
        return y4;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    public double getX4() {
        return x4;
    }

    public double getX3() {
        return x3;
    }

    public double getX2() {
        return x2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }
    public static Square createRandomSquare() {
        Random random = new Random();
        // Генеруємо випадкові цілі координати для вершин квадрата
        double x1 = random.nextInt(100); // Вершина 1: x-координата
        double y1 = random.nextInt(100); // Вершина 1: y-координата
        double x2 = x1 + random.nextInt(10) + 1; // Вершина 2: x-координата (більша за x1)
        double y2 = y1; // Вершина 2: y-координата (та ж сама, що і у вершини 1)
        double x3 = x1; // Вершина 3: x-координата (та ж сама, що і у вершини 1)
        double y3 = y1 + random.nextInt(10) + 1; // Вершина 3: y-координата (більша за y1)
        double x4 = x2; // Вершина 4: x-координата (та ж сама, що і у вершини 2)
        double y4 = y3; // Вершина 4: y-координата (та ж сама, що і у вершини 3)
        return new Square(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    // Метод для обчислення периметру квадрата
    public double calculatePerimeter() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return 4 * side1;
    }

    // Метод для обчислення площі квадрата
    public double calculateArea() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return side1 * side1;
    }

    // Метод для виведення об'єкту квадрата
    public void display() {
        System.out.println("Квадрат з вершинами (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + "), (" + x4 + ", " + y4 + ")");
    }
}
