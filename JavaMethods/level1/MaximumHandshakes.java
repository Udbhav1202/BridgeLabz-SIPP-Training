package JavaMethods.level1;

import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int handshakes = calculateHandshakes(students);
        System.out.println(handshakes);
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
