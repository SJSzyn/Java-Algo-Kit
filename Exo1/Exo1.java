public class Exo1 {
    static void enumerate_while(int maxNum) {
        int i = 1; // Always declare the data type
        while (i <= maxNum) {
            System.out.println(i);
            i++;
        }
    }

    static void enumerate_for(int maxNum) {
        for (int i = 1; i <= maxNum; i++) {
            System.out.println(i);
        }
    }

    static void enumerate_even(int maxNum) {
        for (int i = 0; i <= maxNum; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Using the while loop");
        enumerate_while(100);
        System.out.println("Using the for loop");
        enumerate_for(100);
        System.out.println("Using the for loop with a nested condition using modulo");
        enumerate_even(100);
    }

}
