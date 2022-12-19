public class MainStackArrayList {
    public static void main(String[] args) {
        StackArrayList<String> stack = new StackArrayList<>();
        stack.push("aaa");
        stack.push("bbb");
        System.out.print(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
