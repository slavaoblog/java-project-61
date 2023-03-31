package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Progression {
    static final int UPPER_BOUND_FOR_FIRST_MEMBER = 20;
    static final int UPPER_BOUND_STEP_VALUE = 6;
    static final int NUMBER_OF_MEMBERS = 10;
    public static void startGame() {
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int firstMember = Utils.generateNumber(0, UPPER_BOUND_FOR_FIRST_MEMBER); // first member.
            int stepValue = Utils.generateNumber(1, UPPER_BOUND_STEP_VALUE); // step value.
            int indexOfMissing = Utils.generateNumber(0, NUMBER_OF_MEMBERS); // missing member index.
            int[] progressionArray = numsArray(NUMBER_OF_MEMBERS, firstMember, stepValue);
            String progression = "";
            for (var j = 0; j < NUMBER_OF_MEMBERS; j++) {
                progression = j == indexOfMissing ? progression + ".. " : progression + progressionArray[j] + " ";
            }
            Engine.setQuestionAnswerArray(i, 0, "Question: " + progression);
            Engine.setQuestionAnswerArray(i, 1, "" + (progressionArray[indexOfMissing]));
        }
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        Engine.answer();
    }
    public static int[] numsArray(int length, int start, int step) {
        int[] numsArray = new int[length];
        for (var i = 0; i < length; i++) {
            numsArray[i] = start + step * i;
        } return numsArray;
    }
}
