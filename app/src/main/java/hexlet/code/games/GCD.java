package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void startGame() {
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {
            int randomNum1 = (int) (Math.random() * 100 + 1);
            int randomNum2 = (int) (Math.random() * 100 + 1);
            Engine.setQuestionAnswer(i, 0, "Question: " + randomNum1 + " " + randomNum2);
            Engine.setQuestionAnswer(i, 1, "" + gcd(randomNum1, randomNum2));
        }
        Engine.answer();
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}