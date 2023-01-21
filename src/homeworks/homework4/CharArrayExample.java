package homeworks.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int oQuantity = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                ++oQuantity;
            }
        }
        System.out.println("Quantity of char 'o': " + oQuantity);

        int midElement = chars.length / 2;
        if (midElement % 2 == 0) {
            for (int i = midElement - 1; i <= midElement; i++) {
                System.out.println(chars[i]);
            }
        } else {
            System.out.println(chars[midElement]);
        }

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean d = false;
        System.out.println((chars2[chars2.length - 1] == 'y') && (chars2[chars2.length - 2] == 'l'));


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.println(text[i]);
            }
        }
    }


}
