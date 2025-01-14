package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int i=0; i<cathetusLength; i++) {
            for(int k=0; k<cathetusLength-1-i; k++) {
                System.out.print(" ");
            }
            for(int j=1+i; j>0; j--) {
                System.out.print(j);
            }
            for(int j=2; j<2+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
