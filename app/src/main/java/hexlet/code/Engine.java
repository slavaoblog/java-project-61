package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static String correctAnswer;
    public static int i;

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
