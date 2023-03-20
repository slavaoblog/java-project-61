package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Even {
    static final int UPPER_BOUND_FOR_RANDOM = 100;
    public static void startGame() {
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int randomNumber = (int) (Math.random() * UPPER_BOUND_FOR_RANDOM) + 1;
            Engine.setQuestionAnswerArray(i, 0, "Question: " + randomNumber);
            Engine.setQuestionAnswerArray(i, 1, randomNumber % 2 == 0 ? "yes" : "no");
        }
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.answer();
    }
}
