public class InvertedRightTriangle {

    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to the next line after printing stars
        }
    }
}
