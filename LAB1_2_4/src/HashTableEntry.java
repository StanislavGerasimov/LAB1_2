public class HashTableEntry {
    private double key; // ключ - периметр квадрата
    private Square square; // квадрат

    public HashTableEntry(double key, Square square) {
        this.key = key;
        this.square = square;
    }

    public double getKey() {
        return key;
    }

    public Square getSquare() {
        return square;
    }
}
