package hexlet.code;

import java.util.Scanner;
public class Even {
    public static void number2() {
        Scanner scanner = new Scanner(System.in);
        String userName = new String("");

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            if (playerAnswer.equals(correctAnswer) && i < 2) {
                System.out.println("Correct!");
            } else if (playerAnswer.equals(correctAnswer) && i == 2) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + userName + "!");
            } else {
                System.out.print("'" + playerAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        scanner.close();
    }
}
