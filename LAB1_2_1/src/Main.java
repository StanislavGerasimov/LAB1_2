
public class Main {

        public static void main(String[] args) {
            // Створення квадратів
            Square square1 = Square.createRandomSquare();
            Square square2 = Square.createRandomSquare();
            Square square3 = Square.createRandomSquare();
            Square square4 = Square.createRandomSquare();

            // Створення хеш-таблиці розміром 5
            HashTable hashTable = new HashTable(5);

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
            // Виведення вмісту хеш-таблиці
            hashTable.display();

        }
    }