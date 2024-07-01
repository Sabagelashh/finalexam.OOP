package finalexam.task2;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PaperFactory Staff:\n");
        for (Person p : staff) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}