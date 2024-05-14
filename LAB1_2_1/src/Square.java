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

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getX4() {
        return x4;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    public double getY4() {
        return y4;
    }


    public static Square createRandomSquare() {
        Random random = new Random();
        // Генеруємо випадкові координати для першої вершини квадрата
        double x1 = random.nextInt(100); // Випадкова координата x (від 0 до 99)
        double y1 = random.nextInt(100); // Випадкова координата y (від 0 до 99)

        // Для правильного квадрата знаходимо координати інших вершин
        // Для цього обираємо випадково сторону квадрата та генеруємо координати інших вершин
        int side = random.nextInt(2); // Випадкове число 0 або 1 для вибору сторони квадрата

        double x2, y2, x3, y3, x4, y4;

        if (side == 0) {
            // Якщо сторона 0, квадрат має вершини вліво та вправо від першої вершини
            x2 = x1 + 1;
            y2 = y1;
            x3 = x1 + 1;
            y3 = y1 + 1;
            x4 = x1;
            y4 = y1 + 1;
        } else {
            // Якщо сторона 1, квадрат має вершини вверх та вниз від першої вершини
            x2 = x1;
            y2 = y1 + 1;
            x3 = x1 + 1;
            y3 = y1 + 1;
            x4 = x1 + 1;
            y4 = y1;
        }

        return new Square(x1, y1, x2, y2, x3, y3, x4, y4);
    }


    // Метод для обчислення периметру квадрата
    public double calculatePerimeter() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        return 4 * side1;
    }

    // Метод для обчислення площі квадрата
    public double calculateArea() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return side1 * side1;
    }

    // Метод для виведення об'єкту квадрата
    public void display() {
        System.out.print(" Квадрат з вершинами (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + "), (" + x4 + ", " + y4 + ")");
    }
}
