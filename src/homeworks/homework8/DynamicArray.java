package homeworks.homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size;


    public void add(int value) {

        if (size == array.length) {

            extend();
        }

        array[size] = value;
        size++;
    }

    public int getByIndex(int index) {

        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return -1;
        }
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];

        }
        array = newArray;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

    }

}
