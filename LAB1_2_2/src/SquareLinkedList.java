public class SquareLinkedList { // Клас, що представляє список квадратів
    private Node head;

        private class Node { // Внутрішній клас, який представляє вузол списку
        Square square;
        Node next;

        Node(Square square) {
            this.square = square;
            this.next = null;
        }
    }

        public void add(Square square) {  // Метод для додавання квадрата до списку
        Node newNode = new Node(square);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

        public void display() {  // Метод для виведення вмісту списку
        Node current = head;
        while (current != null) {
            current.square.display();
            current = current.next;
        }
    }
}