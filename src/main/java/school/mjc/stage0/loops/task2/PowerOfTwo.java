package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        while (power <= 0) {
            System.out.println(power);
            power ^=2;
        }

    }
}
