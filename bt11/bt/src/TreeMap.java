import java.util.HashMap;
import java.util.Map;

public class TreeMap<E>  {
    Entry root;
    int numberEn;
    private class Entry{
        int key;
        Object data;

        public Entry(int key, Object data) {
            this.key = key;
            this.data = data;
        }

        public int getKey() {
            return key;
        }

        public Object getData() {
            return data;
        }
    }

    public TreeMap() {
    }
    TreeMap(Object e){

    }
}
