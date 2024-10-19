package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        // Create that will be printing if number is between 1 and 5("number is between 1 and 5"),
        // 6 and 10("number is between 6 and 10") or "out of range" using switch statement.
        switch (number) {
            case (2):
            case (3):
            case (4):
                System.out.println("number is between 1 and 5");
                break;
            case (7):
            case (8):
            case (9):
                System.out.println("number is between 6 and 10");
                break;
        }
    }
}
