public class Exo3A {

        static int[] fibo(int num) {
            int[] FibNumbers = new int[num];
            FibNumbers[0] = 0;
            FibNumbers[1] = 1;
            for (int i = 2; i < num; i++) {
                FibNumbers[i] = FibNumbers[i - 1] + FibNumbers[i - 2];
            }
            return FibNumbers;
        }

        public static void main(String[] args) {
            int num = 10;
            int[] result = fibo(num);
            for (int i = 0; i < num; i++) {
                System.out.print(result[i] + " | ");
            }
        }
}
