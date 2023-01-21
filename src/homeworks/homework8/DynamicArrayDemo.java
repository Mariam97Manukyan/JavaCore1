package homeworks.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(15);
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


    }

}
