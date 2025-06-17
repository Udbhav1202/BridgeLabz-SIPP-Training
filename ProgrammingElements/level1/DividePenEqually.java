package ProgrammingElements.level1;

public class DividePenEqually {
    public static void main(String[] args) {
        int pen =14;
        int students = 3;
        int remainder = pen%students;
        int division = pen/students;
        System.out.println(" The Pen Per Student is "+division+" and the remaining pen not distributed is " +remainder);
    }
}
