package homeworks.homework10.bracechecker;

public class BraceChecker {
    private String text;


    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            switch (symbol) {
                case '(':
                case '[':
                case '{':
                    stack.push(symbol);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.size > -1) {
                        char last = (char) stack.pop();
                        if (symbol == ')' && last != '(' || symbol == ']' && last != '[' || symbol == '}' && last != '{') {
                            System.out.println("Error: " + symbol + " at index " + i);
                        }
                    } else {
                        System.out.println("Error: " + symbol + " at index " + i);
                    }
                    break;
            }
        }
    }
}







