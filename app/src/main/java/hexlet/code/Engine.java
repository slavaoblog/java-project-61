package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    private static String[][] questionAnswer = new String[3][2];

    public static void setQuestionAnswer(int x, int y, String str) {
        questionAnswer[x][y] = str;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userNameInsert) {
        userName = userNameInsert;
    }

    public static void answer() {
        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < 3; i++) {
            System.out.println(questionAnswer[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equals(questionAnswer[i][1]) && i < 2) {
                System.out.println("Correct!");
            } else if (playerAnswer.equals(questionAnswer[i][1])) {
                System.out.println("Correct!\nCongratulations, " + userName + "!");
            } else {
                System.out.print("'" + playerAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + questionAnswer[i][1] + "'.\nLet's try again, " + userName + "!");
                i = 2;
                scanner.close();
            }
        }
    }
}
