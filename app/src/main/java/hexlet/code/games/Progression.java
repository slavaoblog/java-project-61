package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Progression {
    static final int UPPER_BOUND_FOR_FIRST_MEMBER = 20;
    static final int UPPER_BOUND_STEP_VALUE = 6;
    static final int NUMBER_OF_MEMBERS = 10;

    public static void startGame() {
        String gameTask = "What number is missing in the progression?";
        String[][] questionAnswerArray = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int firstMember = Utils.generateNum(0, UPPER_BOUND_FOR_FIRST_MEMBER);
            int stepValue = Utils.generateNum(1, UPPER_BOUND_STEP_VALUE);
            int indexOfMissing = Utils.generateNum(0, NUMBER_OF_MEMBERS - 1);
            int[] progressionArray = generateProgression(NUMBER_OF_MEMBERS, firstMember, stepValue);
            String progression = "";
            for (var j = 0; j < NUMBER_OF_MEMBERS; j++) {
                progression = j == indexOfMissing ? progression + ".. " : progression + progressionArray[j] + " ";
            }
            questionAnswerArray[i][0] = "Question: " + progression;
            questionAnswerArray[i][1] = String.valueOf(progressionArray[indexOfMissing]);
        }
        Engine.runGame(questionAnswerArray, gameTask);
    }

    public static int[] generateProgression(int length, int start, int step) {
        int[] numsArray = new int[length];
        for (var i = 0; i < length; i++) {
            numsArray[i] = start + step * i;
        }
        return numsArray;
    }
}
