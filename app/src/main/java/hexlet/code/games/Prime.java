package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Prime {
    static final int UPPER_BOUND_FOR_RANDOM = 99;
    public static void startGame() {
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int a = (int) (Math.random() * UPPER_BOUND_FOR_RANDOM) + 2;
            Engine.setQuestionAnswerArray(i,  0, "Question: " + a);
            Engine.setQuestionAnswerArray(i,  1, "yes");
            for (var j = 2; j <= a / 2; j++) {
                if (a % j == 0) {
                    Engine.setQuestionAnswerArray(i, 1, "no");
                    j = a;
                }
            }
        }
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.answer();
    }
}
