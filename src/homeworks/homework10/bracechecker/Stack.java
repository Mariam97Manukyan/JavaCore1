package homeworks.homework10.bracechecker;

public class Stack {
    private int[] text = new int[10];
    public int size;

    public Stack() {
        size = -1;

    }

    public void push(int value) {
        if (size == text.length) {
            System.out.println("stack-ը վերջացավ");
        } else {
            text[++size] = value;
        }
    }

    public int pop() {
        if (size < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        } else {
            return text[size--];
        }
    }
}


