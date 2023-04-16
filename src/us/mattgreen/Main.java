package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();

        // Lines to Replace Begin Here

        Scanner keyboard = new Scanner(System.in);
        String userInput;

        do{
            CreateAnimal userAnimal = new CreateAnimal(zoo);
            zoo.add(userAnimal.getAnimal());
            System.out.println("Create another animal? Yes or No");
            userInput = keyboard.nextLine();
        } while (userInput.equalsIgnoreCase("yes"));

        // End Lines to Replace


        for (Talkable thing : zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
