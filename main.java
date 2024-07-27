import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature = 25; // Example temperature, you can change it as needed

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value
        System.out.print("Please enter a value: ");

        // Read the user's input
        int userInput = scanner.nextInt();

        // Print the value entered by the user
        System.out.println("You entered: " + userInput);

        // Close the scanner to prevent resource leak
        scanner.close();

        if (temperature <= 5) {
            System.out.println("It's super cold, wear super warm clothing.");
        } else if (temperature <= 15) {
            System.out.println("It's quite chilly, wear warm clothing.");
        } else if (temperature <= 30) {
            System.out.println("It's moderate, wear normal clothing.");
        } else {
            System.out.println("It's hot outside, you need cooling clothing.");
        }
    }
}


## Can I Change also java file? 🙄🙄🙄
