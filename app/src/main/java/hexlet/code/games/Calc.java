package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void numberThree() {
        Engine.greeting();
        Engine.question();

        for (Engine.i = 0; Engine.i < 3; Engine.i++) {
            int randomNumber1 = (int) (Math.random() * 100);
            int randomNumber2 = (int) (Math.random() * 100);
            int randomSign = (int) (Math.random() * 3);
            int result = 0;
            String sign = "";
            switch (randomSign) {
                case 0:
                    result = randomNumber1 + randomNumber2;
                    sign = " + ";
                    break;
                case 1:
                    result = randomNumber1 - randomNumber2;
                    sign = " - ";
                    break;
                case 2:
                    result = randomNumber1 * randomNumber2;
                    sign = " * ";
                    break;
                default:
                    result = randomNumber1 + randomNumber2;
                    sign = " + ";
                    break;
            }
            System.out.println("Question: " + randomNumber1 + sign + randomNumber2);
            Engine.correctAnswer = "" + result;

            Engine.answer();
        }
    }
}
