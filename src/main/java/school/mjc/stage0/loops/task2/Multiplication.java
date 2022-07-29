package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) return;
        int  i = 0;
        int sign = 1;
        if (multiplyByAndToInclusive < 0) {
            sign = -1;
        }
        while(i <= multiplyByAndToInclusive * sign)
        {
            System.out.println(multiplyByAndToInclusive * i);
            i++;
        }
    }
}
