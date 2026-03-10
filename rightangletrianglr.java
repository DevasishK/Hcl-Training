public class EquilateralTriangle {
    private int height;

    public EquilateralTriangle(int height) {
        this.height = height;
    }

    public void print() {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            System.out.println();
        }
    }

    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        triangle.print();
    }
}