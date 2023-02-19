package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void numberSix() {
        Engine.greeting();
        Engine.question();

        for (Engine.i = 0; Engine.i < 3; Engine.i++) {
            int a = (int) (Math.random() * 100) + 1;
            String result = "yes";
            for (var i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    result = "no";
                    i = a;
                }
            }
            System.out.println("Question: " + a);
            Engine.correctAnswer = "" + result;

            Engine.answer();
        }
    }
}
