package chapter12.Clooections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: SortedSetComparatorTest
 * Date: 2017-08-10
 * Time: 오전 8:52
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SortedSetComparatorTest {
    public static void main(String[] args) {
        // Create a sorted set sorted by id
        SortedSet<Person> personsById =
            new TreeSet<>(Comparator.comparing(Person::getId));
        // Add soem persons to the set
        personsById.add(new Person(1, "John"));
        personsById.add(new Person(2, "Adam"));
        personsById.add(new Person(3, "Eve"));
        personsById.add(new Person(4, "Donna"));
        personsById.add(new Person(4, "Donna")); // A duplicate Person
        // Print the set
        System.out.println("Persons by Id:");
        personsById.forEach(System.out::println);
        // Create a sorted set sorted by name
        SortedSet<Person> personsByName =
            new TreeSet<>(Comparator.comparing(Person::getName));
        personsByName.add(new Person(1, "John"));
        personsByName.add(new Person(2, "Adam"));
        personsByName.add(new Person(3, "Eve"));
        personsByName.add(new Person(4, "Donna"));
        personsByName.add(new Person(4, "Kip")); // Not a duplicate person
        System.out.println("Persons by Name: ");
        personsByName.forEach(System.out::println);
    }
}
