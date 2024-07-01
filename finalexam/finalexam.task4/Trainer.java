package finalexam.task4;

import java.io.Serializable;

public class Trainer implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String specialization;
    private String employeeId;

    public Trainer(String name, String specialization, String employeeId) {
        this.name = name;
        this.specialization = specialization;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trainer trainer = (Trainer) obj;
        return employeeId.equals(trainer.employeeId);
    }

    @Override
    public int hashCode() {
        return employeeId.hashCode();
    }
}