package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void runGame(String[][] questionAnswerArray, String gameTask) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameTask);

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println(questionAnswerArray[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equalsIgnoreCase(questionAnswerArray[i][1]) && i < NUMBER_OF_ROUNDS - 1) {
                System.out.println("Correct!");
            } else if (playerAnswer.equalsIgnoreCase(questionAnswerArray[i][1])) {
                System.out.println("Correct!\nCongratulations, " + userName + "!");
                scanner.close();
            } else {
                System.out.print("'" + playerAnswer + "' is wrong answer ;(. ");
                System.out.print("Correct answer was '" + questionAnswerArray[i][1]);
                System.out.println("'.\nLet's try again, " + userName + "!");
                i = NUMBER_OF_ROUNDS;
                scanner.close();
            }
        }
    }
}
