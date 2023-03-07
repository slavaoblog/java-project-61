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
            case 0 -> {
            }
            case 1 -> Cli.greeting();
            case 2 -> Even.numberTwo();
            case 3 -> Calc.numberThree();
            case 4 -> GCD.numberFour();
            case 5 -> Progression.numberFive();
            case 6 -> Prime.numberSix();
            default -> System.out.println("Введен некорректный номер игры, введите еще раз.");
        }
    }
}
