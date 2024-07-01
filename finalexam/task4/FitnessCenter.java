package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FitnessCenter implements LegalEntity {
    private String name;
    private String address;
    private String vatNumber;
    private List<Trainer> trainers = new ArrayList<>();

    public FitnessCenter(String name, String address, String vatNumber) {
        this.name = name;
        this.address = address;
        this.vatNumber = vatNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addTrainer(Trainer t) {
        if (t != null && !trainers.contains(t)) {
            trainers.add(t);
        }
    }

    public boolean removeTrainer(Trainer t) {
        return trainers.remove(t);
    }

    public List<Trainer> getTrainers() {
        return new ArrayList<>(trainers);
    }

    public Trainer findTrainerByEmployeeId(String employeeId) {
        for (Trainer t : trainers) {
            if (t.getEmployeeId().equals(employeeId)) {
                return t;
            }
        }
        return null;
    }

    public int getTrainerCount() {
        return trainers.size();
    }

    public void saveTrainersToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(trainers);
        }
    }

    public void loadTrainersFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            trainers = (List<Trainer>) ois.readObject();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Fitness Center: " + name + "\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("VAT Number: ").append(vatNumber).append("\n");
        sb.append("Trainers:\n");
        for (Trainer t : trainers) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}