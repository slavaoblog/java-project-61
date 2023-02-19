package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static int gameNumber;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");

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
            case 5:
                Progression.numberFive();
            case 6:
                Prime.numberSix();
            default:
                break;
        }
        scanner.close();
    }

}
