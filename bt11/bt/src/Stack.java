public class Stack<E> {
    private Node head;
    private Node tail;
    int numberNode = 0;

    private class Node {
        private Node next;
        private E data;

        Node() {
        }

        public Node(E data) {
            this.data = data;

        }

        public Object getData() {
            return data;
        }
    }

    Stack() {
    }

    public Stack(E e) {
        this.head = new Node(e);
        numberNode++;
    }

    public int getNumberNode() {
        return numberNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());

            temp = temp.next;
        }
    }

    public void add(E e) {
        if (head != null) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numberNode++;
        } else {
            this.head = new Node(e);
            numberNode++;
        }
    }

    public E pop() {
        Node temp = head;
        Node holdReslfu;
        for (int i = 0; i < numberNode - 2; i++) {
            temp = temp.next;
        }
        holdReslfu = temp.next;
        tail = temp;
        tail.next = null;
        return (E) holdReslfu.getData();
    }
}
