package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static int gameNumber;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 0:
                break;
            case 1:
                Engine.greeting();
                break;
            case 2:
                Even.numberTwo();
                break;
            case 3:
                Calc.numberThree();
                break;
            case 4:
                GCD.numberFour();
                break;
            default:
                break;
        }
        scanner.close();
    }

}
