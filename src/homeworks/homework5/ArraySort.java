package homeworks.homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int a = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = a;
                }

            }

        }
        System.out.print("ascending sort : ");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");


        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int a = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = a;
                }

            }

        }
        System.out.print("descending sort : ");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");


    }

}
