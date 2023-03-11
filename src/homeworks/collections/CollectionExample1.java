package homeworks.collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("aram");
        names.add("tigran");
        names.add("monte");
        names.add("lucy");
        names.add("murad");

        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println(name + " is already in the list.");
        } else {
            names.add(name);
            System.out.println(name + " has been added to the list.");
        }
        System.out.println("Enter a name");
        String name1 = scanner.nextLine();
        if (names.contains(name1)) {
            System.out.println(name1 + " is already in the list.");
            names.remove(name1);
        } else {
            names.add(name1);
            System.out.println(name1 + " has been added to the list.");
        }
        System.out.println(names);

        System.out.print("Enter a name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter an index to add the name: ");
        int index = scanner.nextInt();
        names.add(index, name2);
        System.out.println(names);

    }
}
