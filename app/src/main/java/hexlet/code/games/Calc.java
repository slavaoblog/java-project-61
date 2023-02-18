package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void numberThree() {
        Engine.greeting();
        Engine.question();

        for (Engine.i = 0; Engine.i < 3; Engine.i++) {
            int a = (int) (Math.random() * 100) + 1;
            int b = (int) (Math.random() * 100) + 1;
            int result = 0;
            String sign = "";
            switch ((int) (Math.random() * 3)) {
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
            System.out.println("Question: " + a + sign + b);
            Engine.correctAnswer = "" + result;

            Engine.answer();
        }
    }
}
