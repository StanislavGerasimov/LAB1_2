public class HashTable {
    private int size; // Розмір хеш-таблиці
    private Square[] table; // Масив, який представляє хеш-таблицю

    // Конструктор, що приймає розмір хеш-таблиці
    public HashTable(int size) {
        this.size = size;
        this.table = new Square[size];
    }

    // Метод, який перевіряє, чи фігура є квадратом
    public static boolean isSquare(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double side4 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));

        double diagonal1 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double diagonal2 = Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2));


        // Перевіряємо рівність всіх сторін та діагоналей
        return (side1 == side2 && side2 == side3 && side3 == side4) && (diagonal1 == diagonal2);
    }



    //метод для вирахування індексу елементу
    public int hashCount(Square square){
        return (int) square.calculatePerimeter()%size;
    }
    public int getHash(Square square){
        return hashCount(square);
    }



    // Метод для додавання квадрата в хеш-таблицю
    public boolean insert(Square square) {
        if (isSquare(square.getX1(), square.getY1(), square.getX2(), square.getY2(), square.getX3(), square.getY3(), square.getX4(), square.getY4())) {
            int index = hashCount(square);

            // Перевіряємо, чи елемент за вирахованим індексом вже існує
            if (table[index] == null) {
                table[index] = square;
                return true;

            } else {
                // Якщо за вирахованим індексом вже є елемент, знаходимо вільне місце в таблиці
                for (int i = index + 1; i < size; i++) {
                    if (table[i] == null) {
                        table[i] = square;

                    }
                }
                for (int i = 0; i < index; i++) {
                    if (table[i] == null) {
                        table[i] = square;

                    }
                }
                System.out.println("Хеш-таблиця переповнена. Неможливо вставити квадрат.");
                return false;
            }

        }
        return false;
    }
    // Метод для виведення вмісту хеш-таблиці
    public void display() {
        System.out.println("Вміст хеш-таблиці:");
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                System.out.print("Номер таблиці: "+i + " Ключ: "+getHash(table[i]));
                table[i].display();
                System.out.println();
            }
        }
    }
}
