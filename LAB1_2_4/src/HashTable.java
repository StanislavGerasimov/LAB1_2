public class HashTable {
    private int size; // розмір хеш-таблиці
    private HashTableEntry[] table; // масив елементів хеш-таблиці

    public HashTable(int size) {
        this.size = size;
        table = new HashTableEntry[size];
    }

    // Метод для вставки елемента в хеш-таблицю
    public void insert(double key, Square square) {
        if (square.isSquare(square.getX1(), square.getY1(), square.getX2(), square.getY2(), square.getX3(), square.getY3(), square.getX4(), square.getY4())) {
            int index = hash(key);

            // Вирішення колізії методом роздільного зв'язування
            while (table[index] != null) {
                index = (index + 1) % size;
            }

            table[index] = new HashTableEntry(key, square);
        }
    }

    // Метод для виведення вмісту хеш-таблиці
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("Позиція " + i + ": ");
            if (table[i] != null) {
                System.out.println("Ключ: " + table[i].getKey());
                table[i].getSquare().display();
            } else {
                System.out.println("Порожньо");
            }
        }
    }

    // Метод для видалення елементів зі значенням площі менше від заданого
    public void removeEntriesWithAreaLessThan(double threshold) {
        for (int i = 0; i < size; i++) {
            if (table[i] != null && table[i].getSquare().calculateArea() < threshold) {
                table[i] = null;
            }
        }
    }

    // Метод для обчислення хешу методом ділення
    private int hash(double key) {
        return (int) (key % size);
    }
}
