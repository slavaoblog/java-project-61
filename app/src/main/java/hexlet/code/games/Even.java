package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGame() {
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            Engine.setQuestionAnswer(i, 0, "Question: " + randomNumber);
            Engine.setQuestionAnswer(i, 1, randomNumber % 2 == 0 ? "yes" : "no");
        }
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.answer();
    }
}
