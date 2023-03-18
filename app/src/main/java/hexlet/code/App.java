package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");

        boolean exit;
        do {
            exit = true;
            String n = scanner.nextLine();
                switch (n) {
                    case "0" -> {
                    }
                    case "1" -> Cli.greeting();
                    case "2" -> Even.startGame();
                    case "3" -> Calc.startGame();
                    case "4" -> GCD.startGame();
                    case "5" -> Progression.startGame();
                    case "6" -> Prime.startGame();
                    default -> {
                        System.out.println("Incorrect game number entered, please re-enter.");
                        exit = false;
                    }
                }
        } while (!exit);
    }
}
