package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int i = 1; i < numberToGoUntil; i++) {
            if (numberToGoUntil < toBreakWith) {
                System.out.print("iterating till the end\n1\n2\n3\n4\n5\n");
                break;
            }
            System.out.println(i);
            if (i == toBreakWith) {
                break;
            }
        }
    }
}
