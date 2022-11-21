public class Stack {
    private LinkedList list;

    public Stack(){
        list = new LinkedList();
    }

    public void push(Object object){
        list.insertLast(object);
    }

    public Object pop() throws EmptyListException {
        Object object = list.getLastObject();
        try {
            list.remove(object);
        } catch (ObjectNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void empty(){
        list.empty();
    }

    public String toString(){
        return list.toString();
    }

    public void print(){
        System.out.println(toString());
    }
}

