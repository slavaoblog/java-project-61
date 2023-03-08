package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static void startGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (Engine.i = 0; Engine.i < 3; Engine.i++) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Question: " + randomNumber);
            Engine.correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            Engine.answer();
        }
    }
}
