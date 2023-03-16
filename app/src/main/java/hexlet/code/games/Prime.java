package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int a = (int) (Math.random() * 100) + 1;
            Engine.setQuestionAnswer(i,0, "Question: " + a);
            Engine.setQuestionAnswer(i,1, "yes");
            for (var j = 2; j <= a / 2; j++) {
                if (a % j == 0) {
                    Engine.setQuestionAnswer(i,1, "no");
                    j = a;
                }
            }
        }
        Engine.answer();
    }
}
