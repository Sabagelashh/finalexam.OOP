package finalexam.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        if (p != null && !staff.contains(p)) {
            staff.add(p);
        }
    }

    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    public List<Person> getStaff() {
        return new ArrayList<>(staff);
    }

    public Person findPersonByPersonalNumber(String personalNumber) {
        for (Person p : staff) {
            if (p.getPersonalNumber().equals(personalNumber)) {
                return p;
            }
        }
        return null;
    }

    public int getStaffCount() {
        return staff.size();
    }

    public void saveStaffToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(staff);
        }
    }

    public void loadStaffFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            staff = (List<Person>) ois.readObject();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PaperFactory Staff:\n");
        for (Person p : staff) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}