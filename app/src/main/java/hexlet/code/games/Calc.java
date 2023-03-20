package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Calc {
    static final int NUM_OF_MATH_OPERATIONS = 3;
    static final int UPPER_BOUND_FOR_RANDOM = 100;
    public static void startGame() {
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int a = (int) (Math.random() * UPPER_BOUND_FOR_RANDOM) + 1;
            int b = (int) (Math.random() * UPPER_BOUND_FOR_RANDOM) + 1;
            int result = 0;
            String sign = "";
            switch ((int) (Math.random() * NUM_OF_MATH_OPERATIONS)) {
                case 0 -> {
                    result = a + b;
                    sign = " + ";
                }
                case 1 -> {
                    result = a - b;
                    sign = " - ";
                }
                case 2 -> {
                    result = a * b;
                    sign = " * ";
                }
                default -> {
                }
            }
            Engine.setQuestionAnswerArray(i, 0, "Question: " + a + sign + b);
            Engine.setQuestionAnswerArray(i, 1, "" + result);
        }
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        Engine.answer();
    }
}
