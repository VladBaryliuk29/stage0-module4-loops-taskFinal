package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public static void printLine(int sideLength, int side) {
        for (int y = side - sideLength; y > 0; y--) {
            System.out.print(" ");
        }
        for (int x = 0; x < sideLength; x++) {
            System.out.print("*");
        }
        if ( sideLength > 0) {
            System.out.println();
        }
    }
    public static void printHalfPyramid(int cathetusLength) {
        for (int y = 1; y <= cathetusLength; y++) {
            printLine(y, cathetusLength);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
