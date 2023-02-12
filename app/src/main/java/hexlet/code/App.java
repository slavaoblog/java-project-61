package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 0:
                return;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                return;
            case 2:
                Even.number2();
            default:
                return;
        }

    }

}
