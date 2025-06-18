package JavaMethods.level3;

public class OTP {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 1; i < otps.length; i++) {
            if (otps[i] != otps[0]) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }

        if (areOTPsUnique(otps)) {
            System.out.println("OTPs are unique (not all are the same).");
        } else {
            System.out.println("All OTPs are the same.");
        }
    }
}
