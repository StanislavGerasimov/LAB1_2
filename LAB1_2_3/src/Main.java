public class Main {
    public static void main(String[] args) {
        // Створення квадратів
        Square square1 = new Square(0, 0, 2, 0, 2, 2, 0, 2);
        Square square2 = new Square(0, 0, 3, 0, 3, 3, 0, 3);
        Square square3 = new Square(0, 0, 4, 0, 4, 4, 0, 4);
        Square square4 = Square.createRandomSquare();
        // Створення хеш-таблиці розміром 5
        HashTable hashTable = new HashTable(3);

        // Вставка квадратів в хеш-таблицю
        if(hashTable.insert(square1)) {
            System.out.println("Квадрат вставлений в таблицю");
        }
        else{
            System.out.println("Помилка вставлення");
        }
        if(hashTable.insert(square2)) {
            System.out.println("Квадрат вставлений в таблицю");
        }
        else{
            System.out.println("Помилка вставлення");
        }
        if(hashTable.insert(square3)) {
            System.out.println("Квадрат вставлений в таблицю");
        }
        else{
            System.out.println("Помилка вставлення");
        }
        if(hashTable.insert(square4)) {
            System.out.println("Квадрат вставлений в таблицю");
        }
        else{
            System.out.println("Помилка вставлення");
        }

        // Виведення вмісту хеш-таблиці до видалення
        System.out.println("До видалення:");
        hashTable.display();

        // Видалення елементів зі значенням площі меншим за задане
        hashTable.removeByArea(10.0);

        // Виведення вмісту хеш-таблиці після видалення
        System.out.println("Після видалення:");
        hashTable.display();
    }
}
