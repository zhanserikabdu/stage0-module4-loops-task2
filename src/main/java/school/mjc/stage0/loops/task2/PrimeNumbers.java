package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;
        while (num <= printToInclusive) {
            int isPrime = 0;
            int j = 2;
            while (j <= num / 2) {
                if (num % j == 0) {
                    isPrime = 1;
                    break;
                }
                j++;
            }
            if (isPrime == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
