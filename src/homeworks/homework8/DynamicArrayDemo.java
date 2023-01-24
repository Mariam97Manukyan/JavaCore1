package homeworks.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(3);
        dy.add(26);
        dy.add(36);
        dy.add(41);
        dy.add(53);
        dy.add(67);
        dy.add(74);
        dy.add(82);
        dy.add(99);
        dy.add(66);
        dy.add(15);
        dy.add(26);

        System.out.println(dy.getByIndex(3));
        System.out.println(dy.getByIndex(-1));
        System.out.println(dy.getByIndex(40));
        System.out.print("Array after adding  elements: ");
        dy.print();
        dy.deleteByIndex(4);
        dy.deleteByIndex(-1);
        dy.deleteByIndex(28);
        dy.print();
        dy.add(0, 18);
        dy.add(-1, 5);
        dy.add(40, 5);
        dy.print();
        dy.set(1, 5);
        dy.set(-1, 5);
        dy.set(19, 5);
        dy.print();
        boolean result = dy.exists(66);
        System.out.println(result);
        result = dy.exists(100);
        System.out.println(result);

        int index = dy.getIndexByValue(26);
        System.out.println("Index of 26: " + index);
        index = dy.getIndexByValue(100);
        System.out.println("Index of 100: " + index);


    }

}
