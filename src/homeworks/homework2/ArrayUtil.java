package homeworks.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int i;
        int num[] = {8, 5, 8, 12, 32, 22, 11, 66, 12, 32, 33};
        int max;
        max = num[0];
        for (i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("Մասիվի ամենամեծ թիվն է - " + max);

        int min;
        min = num[0];
        for (i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];

            }

        }
        System.out.println("Մասիվի ամենափոքր թիվն է - " + min);


        for (i = 0; i < num.length; i++) {
            int j = num[i];
            System.out.print(j + " ");


        }
        System.out.println();

        int quantityEven = 0;
        for (i = 0; i < num.length; i++) {

            int even = num[i];
            if (num[i] % 2 == 0) {

                ++quantityEven;
                System.out.print(num[i] + " ");


            }

        }
        System.out.println();
        System.out.println("Quantity of even numbers is : " + quantityEven);

        int quantityOdd = 0;
        for (i = 0; i < num.length; i++) {
            int odd = num[i];
            if (num[i] % 2 != 0) {
                ++quantityOdd;
                System.out.print(num[i] + " ");
            }

        }

        System.out.println();
        System.out.println("Quantity of odd numbers is: " + quantityOdd);


        int sum = 0;
        for (i = 0; i < num.length; i++) {
            sum += num[i];

        }
        System.out.println(sum);

        int result = 0;
        for (i = 0; i < num.length; i++) {
            result = result + num[i];

        }
        System.out.println("Arithmetic mean value = " + result / num.length);


        int firstElement = num[0];
        System.out.println("First element is: " + firstElement);

        int lastElement = num[num.length - 1];
        System.out.println("Last element is: " + lastElement);

        int midElement = num[num.length / 2];
        System.out.println("Mid element is: " + midElement);
    }

}
