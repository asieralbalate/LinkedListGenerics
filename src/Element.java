public class Element {
    private Object object;
    private Element next;

    public Element(Object newObject) {
        this.object = newObject;
        next = null;
    }

    public void setNext(Element element) {
        next = element;
    }

    public Object getObject() {
        return object;
    }

    public Element getNext() {
        return next;
    }

    public void setObject(Object newObject) {
        this.object = newObject;
    }

    public void delete() {
        object = null;
        next = null;
    }
}
