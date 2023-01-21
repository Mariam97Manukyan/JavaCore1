package homeworks.homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 16;
        int b = 26;
        if (a < b) {
            System.out.println("max: " + b);
        }
        if (a > b) {
            System.out.println("max: " + a);
        }

        for (int i = a; i <= b; i++) {
            System.out.print(i + ",");

        }
        System.out.println();

        if (a == b) {
            System.out.println("a-ն հավասար է b-ին");
        } else {
            System.out.println(" a-ն հավասար չէ b-ին");

        }


        char c;
        c = (char) a;
        System.out.println(c);
        char f;
        f = (char) b;
        System.out.println(f);

    }

}
