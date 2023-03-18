package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void startGame() {
        int numOfGameStages = 3;
        int upperBoundForRandom = 100;
        for (int i = 0; i < numOfGameStages; i++) {
            int randomNum1 = (int) (Math.random() * upperBoundForRandom + 1);
            int randomNum2 = (int) (Math.random() * upperBoundForRandom + 1);
            Engine.setQuestionAnswer(i, 0, "Question: " + randomNum1 + " " + randomNum2);
            Engine.setQuestionAnswer(i, 1, "" + gcd(randomNum1, randomNum2));
        }
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.answer();
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
