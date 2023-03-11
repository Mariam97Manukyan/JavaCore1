package homeworks.collections;

import java.util.*;

public class CollectionExample2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        while (names.size() < 5) {
            System.out.println("Enter a name: ");
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("The 5 names are:");
        for (String name : names) {
            System.out.println(name);
        }
        Collections.addAll(names, "aram", "tigran", "susik", "monte", "murad", "lucy", "gevorg", "sargis", "kara", "meri", "tatev");
        System.out.println("All names are:" + names);
    }
}

