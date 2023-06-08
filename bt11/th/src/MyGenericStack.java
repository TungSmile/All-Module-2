import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    // pop thì phải cái gì éo có chứ , mai nhớ check lại
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public  int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

}
