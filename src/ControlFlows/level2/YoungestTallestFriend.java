package ControlFlows.level2;
import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt(); 
        int height1 = sc.nextInt();

        int age2 = sc.nextInt(); 
        int height2 = sc.nextInt();

        int age3 = sc.nextInt(); 
        int height3 = sc.nextInt();

        int youngestAge = age1;
        String youngest = "Amar";

        if (age2 < youngestAge) {
            youngestAge = age2;
            youngest = "Akbar";
        }

        if (age3 < youngestAge) {
            youngest = "Anthony";
        }

        int tallestHeight = height1;
        String tallest = "Amar";

        if (height2 > tallestHeight) {
            tallestHeight = height2;
            tallest = "Akbar";
        }

        if (height3 > tallestHeight) {
            tallest = "Anthony";
        }

        System.out.println(youngest);
        System.out.println(tallest);
    }
}
