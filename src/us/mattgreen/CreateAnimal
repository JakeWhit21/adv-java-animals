package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAnimal {
    private final String REQUIRED_MSG = " is mandatory";
    private String animalType;
    private String animalName;
    private boolean friendly;
    private int miceKilled;
    private int age;
    private Talkable talkableObject;
    private ArrayList<Talkable> zoo;
    private final CommandLineOutputService output = new CommandLineOutputService();
    Scanner keyboard = new Scanner(System.in);

    public CreateAnimal(ArrayList zoo) {
        this.zoo = zoo;
        animalPrompt();
        gatherAnimalInformation();
        createAnimalObject();
    }

    private void animalPrompt() {
        output.simpleOutput("What type of animal would you like to create?");
        setAnimalType(keyboard.nextLine());
    }

    private void setAnimalType(String animalType) {
        if (animalType == null || animalType.isBlank()) {
            throw new IllegalArgumentException("Animal type" + REQUIRED_MSG);
        }
        this.animalType = animalType;
    }

    private void createAnimalObject() {
        if (animalType.equalsIgnoreCase("Dog")) {
            this.talkableObject = new Dog(friendly, animalName);
        } else if (animalType.equalsIgnoreCase("Cat")) {
            this.talkableObject = new Cat(miceKilled, animalName);
        } else if (animalType.equalsIgnoreCase("Teacher")) {
            this.talkableObject = new Teacher(age, animalName);
        }
    }

    public Talkable getAnimal() {
        return talkableObject;
    }

    private void gatherAnimalInformation() {
        if (animalType.equalsIgnoreCase("Dog")) {
            output.simpleOutput("Is this dog friendly? Type yes or no");
            setFriendly(keyboard.nextLine());
            output.simpleOutput("What is the name for the dog?");
            setAnimalName(keyboard.nextLine());
        } else if (animalType.equalsIgnoreCase("Cat")) {
            output.simpleOutput("How many mice did this cat kill?");
            setMiceKilled(Integer.parseInt(keyboard.nextLine()));
            output.simpleOutput("What is the name for the cat?");
            setAnimalName(keyboard.nextLine());
        } else if (animalType.equalsIgnoreCase("Teacher")) {
            output.simpleOutput("What is the age of the teacher?");
            setAge(Integer.parseInt(keyboard.nextLine()));
            output.simpleOutput("What is the name for this teacher?");
            setAnimalName(keyboard.nextLine());
        }

    }

    private void setFriendly(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Friendly" + REQUIRED_MSG);
        }
        if (input.equals("yes") || input.equals("Yes")) {
            friendly = true;
        } else if (input.equals("no") || input.equals("No")) {
            friendly = false;
        }
    }

    private void setAnimalName(String animalName) {
        if (animalName == null || animalName.isBlank()) {
            throw new IllegalArgumentException("Animal name" + REQUIRED_MSG);
        }
        this.animalName = animalName;
    }

    private void setMiceKilled(int miceKilled) {
        if (miceKilled < 0) {
            throw new IllegalArgumentException("Mice killed cannot be less than 0");
        }
        this.miceKilled = miceKilled;
    }

    private void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age cannot be less than 18 for teachers");
        }
        this.age = age;
    }
}
