package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int  i = 0;
        while(i <= multiplyByAndToInclusive)
        {
            System.out.printf("%d * %d = %d \n", multiplyByAndToInclusive, i, multiplyByAndToInclusive * i);
            i++;
        }
    }
}
