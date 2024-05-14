import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір хеш-таблиці: ");
        int size = scanner.nextInt();

        HashTable hashTable = new HashTable(size);

        // Вставка елементів в хеш-таблицю
        for (int i = 0; i < size; i++) {
            Square square = new Square();
            hashTable.insert(square.calculatePerimeter(), square);
        }

        // Виведення вмісту хеш-таблиці
        System.out.println("Вміст хеш-таблиці:");
        hashTable.display();

        // Видалення елементів зі значенням площі менше від заданого
        System.out.print("Введіть поріг площі для видалення: ");
        double threshold = scanner.nextDouble();
        hashTable.removeEntriesWithAreaLessThan(threshold);

        // Виведення вмісту хеш-таблиці після видалення
        System.out.println("\nВміст хеш-таблиці після видалення:");
        hashTable.display();
    }
}
