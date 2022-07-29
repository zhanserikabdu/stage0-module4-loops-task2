package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int n = 2;

        while (n <= printToInclusive) {
            if (isPrimeNumber(n)) {
                System.out.println(n);
            }
            n++;
        }
    }
    private boolean isPrimeNumber(int n) {
        int divCount = 0;
        int i = 1;
        if (n == 0) {
            return true;
        }
        while (i <= n) {
            if(n % i == 0) {
                divCount++;
            }
            if (divCount > 2) {
                return false;
            }
            i++;
        }
        return true;
    }
}

