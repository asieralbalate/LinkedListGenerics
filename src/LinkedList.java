
public class LinkedList {
    private Element first;
    private Element last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(Object obj) {
        Element element = new Element(obj);
        element.setNext(first);
        first = element;
        if (isEmpty()) {
            last = element;
        }

    }

    public void insertLast(Object obj) {
        Element element = new Element(obj);
        if (!isEmpty()) {
            last.setNext(element);
        }
        last = element;
        if (isEmpty()) {
            first = element;
        }
    }

    public void print() {
        Element element = first;
        while (element != null) {
            System.out.println(element.getObject());
            element = element.getNext();
        }
    }

    public boolean isEmpty() {
        return first == null || last == null;
    }

    public Object getFirstObject() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("The list is empty.");
        }
        return first.getObject();
    }

    public Object getLastObject() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("The list is empty");
        }
        return last.getObject();
    }

    public int getNumElements() {
        Element e = first;
        int counter = 0;
        while (e != null) {
            e = e.getNext();
            counter++;
        }
        return counter;
    }

    public Object getObjectAtPosition(int index) throws EmptyListException,
            InvalidIndexException {
        if (isEmpty()) {
            throw new EmptyListException("Empty list");
        }
        Element e = first;
        for (int i = 0; i < index; i++) {
            if (e == null) {
                throw new InvalidIndexException("Invalid index");
            }
            e = e.getNext();
        }
        return e.getObject();
    }

    public void remove(Object obj) throws ObjectNotFoundException {
        if (isEmpty()) {
            throw new EmptyListException("Empty list.");
        }
        Element e = first;
        Element temp = first;
        while (e != null) {
            if (e.getObject().equals(obj)) {
                if (e == first){
                    first = e.getNext();
                } else {
                    temp.setNext(e.getNext());
                }
                if (e.getNext() == null){
                    if (first == null){
                        last = null;
                    } else {
                        last = temp;
                    }
                }
                return;
            } else {
                temp = e;
                e = e.getNext();
            }
        }
        throw new ObjectNotFoundException("Object not found");
    }

    public void empty(){
        first = null;
        last = null;
    }
    @Override
    public String toString(){
        String s = "";
        Element e = first;
        boolean alreadyComma = false;
        while (e != null){
            if (!alreadyComma){
                alreadyComma = true;
            } else {
                s += ", ";
            }
            s += e.getObject();
            e = e.getNext();
        }
        return s;
    }
}
