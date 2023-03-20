package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Progression {
    static final int UPPER_BOUND_FOR_FIRST_MEMBER = 20;
    static final int UPPER_BOUND_STEP_VALUE = 6;
    static final int NUMBER_OF_MEMBERS = 10; // progression members and upper bound position for the missing one.
    public static void startGame() {
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int firstMember = (int) (Math.random() * UPPER_BOUND_FOR_FIRST_MEMBER) + 1; // 1-20 the first member.
            int stepValue = (int) (Math.random() * UPPER_BOUND_STEP_VALUE) + 1; // 1-6 the step value.
            int positionOfMissing = (int) (Math.random() * NUMBER_OF_MEMBERS); // 0-9 the missing member position.
            Engine.setQuestionAnswerArray(i, 1, "" + (firstMember + stepValue * positionOfMissing));
            String progression = "";
            // if j==positionOfMissing, adds ".. ", otherwise adds the next member.
            for (var j = 0; j < NUMBER_OF_MEMBERS; j++) {
                progression = j == positionOfMissing ? progression + ".. " : progression + firstMember + " ";
                firstMember = firstMember + stepValue;
            }
            Engine.setQuestionAnswerArray(i, 0, "Question: " + progression);
        }
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        Engine.answer();
    }
}
