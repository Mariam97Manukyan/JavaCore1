package chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "два";
        switch (str) {
            case "oдин":
                System.out.println("oдин");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("нe совпало)");
                break;

        }
    }

}
