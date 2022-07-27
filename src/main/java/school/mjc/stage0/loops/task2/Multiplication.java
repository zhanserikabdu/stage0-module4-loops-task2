package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        while(multiplyByAndToInclusive <=0){
            System.out.println(multiplyByAndToInclusive);
            multiplyByAndToInclusive *=2;
        }
    }
}
