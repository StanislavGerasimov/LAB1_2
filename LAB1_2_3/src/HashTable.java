class HashTable {
    private int size; // Розмір хеш-таблиці
    private SquareLinkedList[] table; // Масив списків, який представляє хеш-таблицю

    // Конструктор, що приймає розмір хеш-таблиці
    public HashTable(int size) {
        this.size = size;
        this.table = new SquareLinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new SquareLinkedList();
        }
    }
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
    public int hashCount(Square square){
       return (int) square.calculatePerimeter() % size; // Використовуємо периметр для обчислення індексу
    }
    // Метод для додавання квадрата в хеш-таблицю
    public boolean insert(Square square) {
        if (isSquare(square.getX1(), square.getY1(), square.getX2(), square.getY2(), square.getX3(), square.getY3(), square.getX4(), square.getY4())) {
            int index = hashCount(square);
            table[index].add(square);
            return true;
        }
        return false;
    }

    // Метод для виведення вмісту хеш-таблиці
    public void display() {
        System.out.println("Вміст хеш-таблиці:");
        for (int i = 0; i < size; i++) {
            System.out.print("Індекс " + i + ": ");
            table[i].display();
            System.out.println();
        }
    }

    // Метод для видалення елементів зі значенням площі меншим за задане
    public void removeByArea(double areaThreshold) {
        for (SquareLinkedList list : table) {
            list.removeByArea(areaThreshold);
        }
    }
}
