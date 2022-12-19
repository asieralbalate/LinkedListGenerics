public class Stack <V> {
    private LinkedList <V> list;

    public Stack() {
        list = new LinkedList<V>();
    }

    public void push(V value) {
        list.insertLast(value);
    }

    public V pop() throws EmptyListException {
        V value = list.getLastValue();
        try {
            list.remove(value);
        } catch (ValueNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void empty() {
        list.empty();
    }

    public String toString() {
        return list.toString();
    }

    public void print() {
        System.out.println(toString());
    }
}

