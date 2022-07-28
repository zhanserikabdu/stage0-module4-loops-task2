package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        long fact = 0;
        int i = 0;
        while(i<=printToInclusive)
        {
            fact = fact * i;
            i++;
        }
        System.out.println(printToInclusive + fact);
    }
        }


