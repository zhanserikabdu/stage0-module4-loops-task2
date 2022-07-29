package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int num = 0;
        if (multiplyByAndToInclusive > 0) {
            while (num <= multiplyByAndToInclusive) {
                int res = multiplyByAndToInclusive * num;
                System.out.println(res);
                num++;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (num >= multiplyByAndToInclusive) {
                int res = multiplyByAndToInclusive * -num;
                System.out.println(res);
                num--;
            }
        }
    }
}