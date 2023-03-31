package hexlet.code;

public class Utils {
    public static int generateNumber(int start, int finish) {
        if (finish < start) {
            System.out.println("Start of range must not exceed end!");
            return 1;
        } else {
            return (int) (Math.random() * (finish - start + 1) + start);
        }
    }
}
