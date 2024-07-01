package finalexam.task3;

import java.io.IOException;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        // Adding persons
        factory.addPerson(new Person("Bon", "Doe", "123456"));
        factory.addPerson(new Person("Jane", "Smith", "789012"));
        factory.addPerson(new Person("Bob", "Johnson", "345678"));

        // Printing all staff
        System.out.println("Original staff:");
        System.out.println(factory);

        // Save staff to file
        try {
            factory.saveStaffToFile("staff.dat");
            System.out.println("Staff saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving staff to file: " + e.getMessage());
        }

        // Clear the factory
        while (factory.getStaffCount() > 0) {
            factory.deletePerson(factory.getStaff().get(0));
        }

        System.out.println("Staff after clearing:");
        System.out.println(factory);

        // Load staff from file
        try {
            factory.loadStaffFromFile("staff.dat");
            System.out.println("Staff loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading staff from file: " + e.getMessage());
        }

        System.out.println("Staff after loading:");
        System.out.println(factory);
    }
}