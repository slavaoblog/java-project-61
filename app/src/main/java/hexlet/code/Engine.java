package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    private static String[][] questionAnswer = new String[3][2]; // 3 for rounds, 2 for question and answer.

    public static void setQuestionAnswer(int x, int y, String str) {
        questionAnswer[x][y] = str;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void answer() {
        for (var i = 0; i < 3; i++) {
            System.out.println(questionAnswer[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equalsIgnoreCase(questionAnswer[i][1]) && i < 2) {
                System.out.println("Correct!");
            } else if (playerAnswer.equalsIgnoreCase(questionAnswer[i][1])) {
                System.out.println("Correct!\nCongratulations, " + userName + "!");
            } else {
                System.out.print("'" + playerAnswer + "' is wrong answer ;(. ");
                System.out.print("Correct answer was '" + questionAnswer[i][1]);
                System.out.println("'.\nLet's try again, " + userName + "!");
                i = 2;
                scanner.close();
            }
        }
    }
}
