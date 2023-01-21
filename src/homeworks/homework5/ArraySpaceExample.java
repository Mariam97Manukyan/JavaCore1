package homeworks.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', 'b', ' ', ' '};


        int firstIndex = 0;
        int lastIndex = spaceArray.length - 1;

        while (firstIndex < lastIndex && spaceArray[firstIndex] == ' ') {
            firstIndex++;

        }
        while (lastIndex > firstIndex && spaceArray[lastIndex] == ' ') {
            lastIndex--;

        }
        char[] array = new char[lastIndex - firstIndex + 1];

        for (int i = firstIndex; i <= lastIndex; i++) {
            array[i - firstIndex] = spaceArray[i];

        }
        System.out.print(array);


    }

}
