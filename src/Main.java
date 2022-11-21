public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push("111");
        queue.push("222");
        queue.push("333");
        try {
            Object obj = queue.pop();
            System.out.println("Popped object = " + obj);
        }
        catch (EmptyListException e){
            System.err.println("The list was empty");
        }
        catch (ObjectNotFoundException e) {
            e.printStackTrace();
        }
        queue.print();
    }
}

