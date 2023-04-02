package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class GCD {
    static final int UPPER_BOUND_FOR_RANDOM = 100;

    public static void startGame() {
        String gameTask = "Find the greatest common divisor of given numbers.";
        String[][] questionAnswerArray = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int randomNum1 = Utils.generateNum(1, UPPER_BOUND_FOR_RANDOM);
            int randomNum2 = Utils.generateNum(1, UPPER_BOUND_FOR_RANDOM);
            questionAnswerArray[i][0] = "Question: " + randomNum1 + " " + randomNum2;
            questionAnswerArray[i][1] = String.valueOf(gcd(randomNum1, randomNum2));
        }
        Engine.runGame(questionAnswerArray, gameTask);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
