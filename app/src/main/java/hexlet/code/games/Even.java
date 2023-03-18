package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGame() {
        int numOfGameStages = 3;
        int upperBoundForRandom = 100;
        for (int i = 0; i < numOfGameStages; i++) {
            int randomNumber = (int) (Math.random() * upperBoundForRandom) + 1;
            Engine.setQuestionAnswer(i, 0, "Question: " + randomNumber);
            Engine.setQuestionAnswer(i, 1, randomNumber % 2 == 0 ? "yes" : "no");
        }
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.answer();
    }
}
