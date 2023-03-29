package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public static void pringIgnor(int ignoring) {
        for(int y = 0; y < ignoring; y++) {
            System.out.print(" ");
        }
    }
    public static void printLine(int ignoring, int cathetusLength) {
        pringIgnor(ignoring);
        for (int i = cathetusLength; i >= 1; i --) {
            System.out.print(i);
        }
        for (int i = 2; i <= cathetusLength; i ++) {
            System.out.print(i);
        }
    }
    public void printPyramid(int cathetusLength) {
        int toPrint = 1;
        for(int i = cathetusLength - 1; i >= 0; i-- ) {
            printLine(i, toPrint);
            System.out.println();
            toPrint++;
        }
    }
}
