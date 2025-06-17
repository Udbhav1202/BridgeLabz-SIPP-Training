package JavaArrays.level2;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            do {
                System.out.print("Physics: ");
                physics[i] = sc.nextInt();
            } while (physics[i] < 0);

            do {
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextInt();
            } while (chemistry[i] < 0);

            do {
                System.out.print("Maths: ");
                maths[i] = sc.nextInt();
            } while (maths[i] < 0);

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 80) grade[i] = 'B';
            else if (percentage[i] >= 70) grade[i] = 'C';
            else if (percentage[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c\n", physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}

