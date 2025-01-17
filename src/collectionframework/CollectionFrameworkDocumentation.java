package collectionframework;

import java.util.*;

public class CollectionFrameworkDocumentation {
    /*
     * The collection framework is the total sum of different types of collections
     * which are objects used to store groups of objects.
     * Static lists (no replace, add, or delete) can be implemented with the help
     * of lists, sets, and maps.
     */

    // Example of creating an unmodifiable list to store elements in JDK 9 and above
    List<Integer> durationOfDetection = List.of(4, 5, 6, 4);
    // Duplicates are allowed here

    // Example of creating an unmodifiable set
    Set<String> nameOfAnimal = Set.of("monkey", "donkey", "tiger");
    // No duplicates are allowed here, which may cause an IllegalArgumentException

    // Example of creating an unmodifiable map
    Map<String, Integer> durationWithName = Map.of("tiger", 4, "lion", 3);

    public static void main(String[] args) {
        CollectionFrameworkDocumentation doc = new CollectionFrameworkDocumentation();

        // Print the contents of the collections
        System.out.println("Duration of Detection: " + doc.durationOfDetection);
        System.out.println("Names of Animals: " + doc.nameOfAnimal);
        System.out.println("Duration with Name: " + doc.durationWithName);
    }
}