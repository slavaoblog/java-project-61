package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void startGame() {
        int numOfGameStages = 3;
        int numOfMathOperations = 3;
        int upperBoundForRandom = 100;
        for (int i = 0; i < numOfGameStages; i++) {
            int a = (int) (Math.random() * upperBoundForRandom) + 1;
            int b = (int) (Math.random() * upperBoundForRandom) + 1;
            int result = 0;
            String sign = "";
            switch ((int) (Math.random() * numOfMathOperations)) {
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
            Engine.setQuestionAnswer(i, 0, "Question: " + a + sign + b);
            Engine.setQuestionAnswer(i, 1, "" + result);
        }
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        Engine.answer();
    }
}
