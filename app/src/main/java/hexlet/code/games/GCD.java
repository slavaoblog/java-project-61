package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class GCD {
    static final int UPPER_BOUND_FOR_RANDOM = 100;
    public static void startGame() {
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int randomNum1 = (int) (Math.random() * UPPER_BOUND_FOR_RANDOM + 1);
            int randomNum2 = (int) (Math.random() * UPPER_BOUND_FOR_RANDOM + 1);
            Engine.setQuestionAnswerArray(i, 0, "Question: " + randomNum1 + " " + randomNum2);
            Engine.setQuestionAnswerArray(i, 1, "" + gcd(randomNum1, randomNum2));
        }
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.answer();
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
