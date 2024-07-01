package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        // Adding persons
        factory.addPerson(new Person("Bon", "Doe", "123456"));
        factory.addPerson(new Person("Jane", "Smith", "789012"));
        factory.addPerson(new Person("Bob", "Johnson", "345678"));

        // Printing all staff
        System.out.println(factory);

        // Finding a person
        Person found = factory.findPersonByPersonalNumber("789012");
        System.out.println("Found person: " + found);

        // Deleting a person
        boolean deleted = factory.deletePerson(found);
        System.out.println("Person deleted: " + deleted);

        // Printing staff count
        System.out.println("Staff count: " + factory.getStaffCount());

        // Printing updated staff list
        System.out.println(factory);
    }
}