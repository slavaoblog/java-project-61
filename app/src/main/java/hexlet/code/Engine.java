package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String userName;
    public static final int NUMBER_OF_ROUNDS = 3;
    private static final String[][] questionAnswerArray = new String[NUMBER_OF_ROUNDS][2];

    public static void setQuestionAnswerArray(int x, int y, String str) {
        questionAnswerArray[x][y] = str;
    }

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void answer() {
        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println(questionAnswerArray[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equalsIgnoreCase(questionAnswerArray[i][1]) && i < NUMBER_OF_ROUNDS - 1) {
                System.out.println("Correct!");
            } else if (playerAnswer.equalsIgnoreCase(questionAnswerArray[i][1])) {
                System.out.println("Correct!\nCongratulations, " + userName + "!");
            } else {
                System.out.print("'" + playerAnswer + "' is wrong answer ;(. ");
                System.out.print("Correct answer was '" + questionAnswerArray[i][1]);
                System.out.println("'.\nLet's try again, " + userName + "!");
                i = 2;
                scanner.close();
            }
        }
    }
}
