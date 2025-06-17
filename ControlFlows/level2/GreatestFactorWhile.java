package ControlFlows.level2;
import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n - 1;
        int greatestFactor = 1;

        while (cnt >= 1) {
            if (n % cnt == 0) {
                greatestFactor = cnt;
                break;
            }
            cnt--;
        }

        System.out.println(greatestFactor);
    }
}
