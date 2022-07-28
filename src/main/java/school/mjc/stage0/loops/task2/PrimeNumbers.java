package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int n = 1;
        int divisibleCount;

        while (n <= 100) {
            divisibleCount = 0;
            while (printToInclusive <= n / 2) {
                if (n % printToInclusive == 0) {
                    divisibleCount++;
                    break;
                }
                printToInclusive++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.print(n + " ");
            }
            n++;
        }

    }
    }

