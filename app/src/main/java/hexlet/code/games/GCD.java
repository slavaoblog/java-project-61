package hexlet.code.games;

import hexlet.code.Engine;
public class GCD {
    public static void numberFour() {
        Engine.greeting();
        Engine.question();

        for (Engine.i = 0; Engine.i < 3; Engine.i++) {
            int randomNumber1 = (int) (Math.random() * 100 + 1);
            int randomNumber2 = (int) (Math.random() * 100 + 1);
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            Engine.correctAnswer = "" + gcd(randomNumber1, randomNumber2);

            Engine.answer();
        }
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
