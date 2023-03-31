package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Prime {
    static final int UPPER_BOUND_FOR_RANDOM = 100;

    public static void startGame() {
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int randomNum = Utils.generateNumber(1, UPPER_BOUND_FOR_RANDOM);
            Engine.setQuestionAnswerArray(i, 0, "Question: " + randomNum);
            Engine.setQuestionAnswerArray(i, 1, isPrime(randomNum) ? "yes": "no");

        }
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.answer();
    }

    public static boolean isPrime(int num) {
        for (var i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
