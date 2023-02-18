package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static String correctAnswer;
    public static int i;

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void question() {
        switch (App.gameNumber) {
            case 2:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case 3:
                System.out.println("What is the result of the expression?");
                break;
            case 4:
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case 5:
                break;
            default:
                break;
        }
    }
    public static void answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String playerAnswer = scanner.next();
        if (playerAnswer.equals(correctAnswer) && i < 2) {
            System.out.println("Correct!");
        } else if (playerAnswer.equals(correctAnswer)) {
            System.out.println("Correct!\nCongratulations, " + userName + "!");
        } else {
            System.out.print("'" + playerAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + correctAnswer + "'.\nLet's try again, " + userName + "!");
            i = 2;
            scanner.close();
        }

    }
}
