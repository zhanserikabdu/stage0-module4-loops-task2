package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 0;
        int res = 1;
        while (num <= printToInclusive) {
            num++;
            System.out.println(res);
            res = res * num;
        }
    }
}
