package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Even {
    static final int UPPER_BOUND_FOR_RANDOM = 100;

    public static void startGame() {
        String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAnswerArray = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int randomNum = Utils.generateNum(1, UPPER_BOUND_FOR_RANDOM);
            questionAnswerArray[i][0] = "Question: " + randomNum;
            questionAnswerArray[i][1] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.runGame(questionAnswerArray, gameTask);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

