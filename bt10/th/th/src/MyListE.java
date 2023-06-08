import java.util.Arrays;

public class MyListE<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;


    public MyListE() {
        Object[] element = new Object[DEFAULT_CAPACITY];
    }

    public MyListE(int capacity) {
        Object[] element = new Object[capacity];
    }

    public void add(int index, E e) {
        if (index < size) {
            element[index] = e;
            size++;
        } else if (index == size) {
            element = new Object[size * 2];
            element[index] = e;
        }
        size++;
    }

    public E remove(int index) {
        if (index < size) {
            for (int i = index; i < element.length - 1; i++) {
                element[i] = element[i + 1];
            }
            element[size] = null;
            size--;
        }
        return (E) element;
    }

    public int Size() {
        return size;
    }

    public E clone() {
        return (E) element;
    }

    public boolean contains(E e) {
        for (Object x : element) {
            if (x == e) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E h) {
        for (int i = 0; i < size; i++) {
            if (element[i] == h) {
                return i;
            }

        }
        return -1;//-1 tuong ứng méo có
    }

    public boolean add(E e) {
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (element.length < minCapacity) {
            element = Arrays.copyOf(element, minCapacity * 2);
        }
    }

    public E get(int i) {
        return (E) element[i];
    }
    public void clear(){
        element=new Object[DEFAULT_CAPACITY];
    }
}