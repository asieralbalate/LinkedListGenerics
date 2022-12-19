import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackArrayList<V> {
    private ArrayList<V> list;

    public StackArrayList() {
        list = new ArrayList<>();
    }

    public void push(V value) {
        list.add(value);
    }

    public V pop() throws EmptyStackException {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        V value = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return value;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void empty() {
        list.clear();
    }

    @Override
    public String toString() {
        String s = "";
        for (V value : list) {
            s += value + " ";
        }
        return s;
    }
}

