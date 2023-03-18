package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void startGame() {
        for (int i = 0; i < 3; i++) {
            int a = (int) (Math.random() * 20) + 1; // 1-20 the value of the first member of the progression.
            int b = (int) (Math.random() * 5) + 2; // 2-6 the step value.
            int c = (int) (Math.random() * 10); // 0-9 the missing member position.
            Engine.setQuestionAnswer(i, 1, "" + (a + b * c));
            String progression = "";
            // if j==c, prints a space, otherwise prints next member.
            for (var j = 0; j < 10; j++) {
                progression = j == c ? progression + ".. " : progression + a + " ";
                a = a + b;
            }
            Engine.setQuestionAnswer(i, 0, "Question: " + progression);
        }
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        Engine.answer();
    }
}
