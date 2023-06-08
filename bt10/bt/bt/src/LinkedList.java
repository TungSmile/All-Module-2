public class LinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        Node(Object data) {
            this.data = data;
        }

        Node() {
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    int numNodes = 0;


    public LinkedList() {
    }

    public LinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    // lỗi add về index đang sai
    public void add(int index, E element) {
        if (numNodes == 0) {
            this.addFirst(element);
        } else if (index <= numNodes) {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(E e) {
        if (numNodes == 0) {
            Node temp = head;
            head = new Node(e);
            head.next = temp;
            numNodes++;
        }
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node prev;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        prev = temp;
        prev.next = temp.next.next;

        return (E) temp;
    }

    public boolean remove1(Object e) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == e) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size() {
        return numNodes;
    }

    public E clone() { //??? méo hiểu hứng kiểu gì
        LinkedList<E> clone = new LinkedList<>();
        Node temp = head;
        Node temp2 = clone.head;
        while (temp != null) {
            temp = temp.next;
            temp2 = temp2.next;
            temp2.data = temp.data;
        }
        return (E) clone;
    }

    public boolean contains(E o) {
        for (Node i = head; i != null; i = i.next) {
            if (i.data == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int count = 0;
        for (Node i = head; i != null; i = i.next) {
            if (i.data == o) {
                return count;
            }
            count++;
        }
        return -1;
    }
//    public boolean add(E e) {
//        if (head.data instanceof E) return true;
//        else return false;
//    }


    public void ensureCapacity(int minCapacity) { // đang lỗi đợi check
        if (numNodes < minCapacity) {
            Node temp = head;
//            while (temp.next != null){
//                temp=temp.next;
//            }
            for (int i = 0; i < minCapacity; i++) {
                temp.next = new Node();
                temp = temp.next;
            }
        }
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node temp=head;
        for (int i = 0; i < numNodes-1; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public void clean(){
        Node temp=head;
        while (temp != null) {
            temp = temp.next;
            temp.data=null;
        }
    }
}
