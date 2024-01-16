public class Exo2B {
    static void sqrRoot (int num) {
        int squareRoot = (int) Math.sqrt(num);
        int result = squareRoot * squareRoot;
        System.out.println(result);
    }

    public static void main(String[] args) {
        sqrRoot(63);
        sqrRoot(30);
    }
}
