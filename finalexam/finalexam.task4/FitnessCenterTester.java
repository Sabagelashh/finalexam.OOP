package finalexam.task4;

import java.io.IOException;

public class FitnessCenterTester {
    public static void main(String[] args) {
        FitnessCenter fitnessCenter = new FitnessCenter("Healthy Life Gym", "123 Fitness St, Gymville", "VAT123456789");

        // Adding trainers
        fitnessCenter.addTrainer(new Trainer("John Doe", "Strength Training", "T001"));
        fitnessCenter.addTrainer(new Trainer("Jane Smith", "Yoga", "T002"));
        fitnessCenter.addTrainer(new Trainer("Mike Johnson", "Cardio", "T003"));

        // Printing all trainers
        System.out.println("Original trainers:");
        System.out.println(fitnessCenter);

        // Save trainers to file
        try {
            fitnessCenter.saveTrainersToFile("trainers.dat");
            System.out.println("Trainers saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving trainers to file: " + e.getMessage());
        }

        // Clear the fitness center
        while (fitnessCenter.getTrainerCount() > 0) {
            fitnessCenter.removeTrainer(fitnessCenter.getTrainers().get(0));
        }

        System.out.println("Trainers after clearing:");
        System.out.println(fitnessCenter);

        // Load trainers from file
        try {
            fitnessCenter.loadTrainersFromFile("trainers.dat");
            System.out.println("Trainers loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading trainers from file: " + e.getMessage());
        }

        System.out.println("Trainers after loading:");
        System.out.println(fitnessCenter);

        // Demonstrate finding a trainer
        Trainer foundTrainer = fitnessCenter.findTrainerByEmployeeId("T002");
        System.out.println("Found trainer: " + foundTrainer);
    }
}