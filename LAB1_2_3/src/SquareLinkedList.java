class SquareLinkedList {
    private Node head;

    // Внутрішній клас, який представляє вузол списку
    private class Node {
        Square square;
        Node next;

        Node(Square square) {
            this.square = square;
            this.next = null;
        }
    }

    // Метод для додавання квадрата до списку
    public void add(Square square) {
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

    // Метод для виведення вмісту списку
    public void display() {
        Node current = head;
        while (current != null) {
            current.square.display();
            current = current.next;
        }
    }

    // Метод для видалення елементів зі значенням площі меншим за задане
    public void removeByArea(double areaThreshold) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.square.calculateArea() < areaThreshold) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            }
            prev = current;
            current = current.next;
        }
    }
}
