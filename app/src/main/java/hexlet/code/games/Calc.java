package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Calc {
    static final int UPPER_BOUND_FOR_RANDOM = 100;
    static final char[] ARRAY_OF_SIGNS = {'+', '-', '*'};

    public static void startGame() {
        Engine.setGameTask("What is the result of the expression?");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int a = Utils.generateNum(0, UPPER_BOUND_FOR_RANDOM);
            int b = Utils.generateNum(0, UPPER_BOUND_FOR_RANDOM);
            int c = Utils.generateNum(0, ARRAY_OF_SIGNS.length - 1);
            char sign = ARRAY_OF_SIGNS[c];
            int result = calculate(a, b, sign);
            Engine.setQuestionAnswerArray(i, 0, "Question: " + a + sign + b);
            Engine.setQuestionAnswerArray(i, 1, "" + result);
        }
    }

    public static int calculate(int operand1, int operand2, char operator) throws RuntimeException {
        switch (operator) {
            case '+' -> {
                return operand1 + operand2;
            }
            case '-' -> {
                return operand1 - operand2;
            }
            case '*' -> {
                return operand1 * operand2;
            }
            default -> throw new RuntimeException("No logic defined for operator '" + operator + "'");
        }
    }
}
