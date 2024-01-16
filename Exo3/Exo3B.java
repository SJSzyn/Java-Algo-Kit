public class Exo3B {
    static double[] approximation_fibo(double x) {
        double golden = (1.0 + Math.sqrt(5.0)) / 2.0;
        double a = 2;
        double b = 1;

        while (Math.abs((a / b) - golden) > x) {
            double temp = a;
            a = a + b;
            b = temp;
        }
        return new double[]{a, b};
    }

    public static void main(String[] args) {
        double x = 0.01;
        double[] result = approximation_fibo(x);
        double goldRatio = result[0] / result[1];
        System.out.println("Approximation of Fibonacci sequence: " + result[0] + " / " + result[1]);
        System.out.println("The Golden Ratio: " + goldRatio);
    }
}

