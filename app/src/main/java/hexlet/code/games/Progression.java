package hexlet.code.games;

import hexlet.code.Engine;
public class Progression {
    public static void numberFive() {
        Engine.greeting();
        Engine.question();

        for (Engine.i = 0; Engine.i < 3; Engine.i++) {
            int a = (int) (Math.random() * 20) + 1;
            int b = (int) (Math.random() * 5) + 2;
            int c = (int) (Math.random() * 10);
            int result = a + b * c;
            String progression = "";
            for (var x = 0; x < 10; x++) {
                progression = x == c ? progression + ".. " : progression + a + " ";
                a = a + b;
            }
            System.out.println("Question: " + progression);
            Engine.correctAnswer = "" + result;

            Engine.answer();
        }
    }
}
