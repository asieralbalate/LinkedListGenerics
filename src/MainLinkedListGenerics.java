public class MainLinkedListGenerics {
    public static void main(String[] args) throws EmptyListException {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        System.out.println(list);

        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        System.out.println(s);

        Queue<Integer> q = new Queue<>();
        q.push(1);
        q.push(2);
        q.push(3);
        q.pop();
        System.out.println(q);

    }
}
