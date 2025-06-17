package ProgrammingElements.level1;

public class ComputeVolOfEarth {
    public static void main(String[] args) {
        int r=6378;
        double volOfSphere = (4.0 / 3.0) * 3.14 * (r * r * r);
        System.out.println("The volume of earth in cubic kilometers is "+volOfSphere +" and cubic miles is "+(volOfSphere*10.6));
    }
}
