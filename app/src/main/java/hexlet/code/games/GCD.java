package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class GCD {
    static final int UPPER_BOUND_FOR_RANDOM = 100;

    public static void startGame() {
        Engine.setGameTask("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int randomNum1 = Utils.generateNum(0, UPPER_BOUND_FOR_RANDOM);
            int randomNum2 = Utils.generateNum(0, UPPER_BOUND_FOR_RANDOM);
            Engine.setQuestionAnswerArray(i, 0, "Question: " + randomNum1 + " " + randomNum2);
            Engine.setQuestionAnswerArray(i, 1, "" + gcd(randomNum1, randomNum2));
        }
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
