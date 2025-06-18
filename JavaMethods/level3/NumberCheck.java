package JavaMethods.level3;
import java.util.*;

public class NumberCheck {

    public static int countDigit(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n / 10;
            cnt++;
        }
        return cnt;
    }

    public static int[] getDigits(int n) {
        int[] digits = new int[countDigit(n)];
        int idx = digits.length - 1;
        while (n != 0) {
            digits[idx--] = n % 10;
            n = n / 10;
        }
        return digits;
    }

    public static boolean duckInt(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) return true;
        }
        return false;
    }

    public static boolean armStrong(int n, int[] arr) {
        int sum = 0;
        for (int digit : arr) {
            sum += digit * digit * digit;
        }
        return sum == n;
    }

    public static int smallest(int[] arr) {
        int small = Integer.MAX_VALUE;
        for (int i=0; i<arr.length;  i++) {
            if (arr[i] < small) small = i;
        }
        return small;
    }

    public static int largest(int[] arr) {
        int large = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;  i++) {
            if (arr[i] > large) large = i; 
        }
        return large;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    public static int sumOfSqr(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i * i;
        return sum;
    }

    public static boolean harshadNum(int[] arr, int n) {
        int digitSum = sum(arr);
        return n % digitSum == 0; 
    }

    public static int[][] frequency(int[] arr) {
        int[][] arr2d = new int[10][2];
        for (int i = 0; i < 10; i++) {
        	arr2d[i][0] = i;
        }
        for (int digit : arr) {
        	arr2d[digit][1]++;
        }
        return arr2d;
    }
    
    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }
    
    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
    
    public static boolean isPalindrome(int[] digits) {
    	int a = 0;
    	int b = digits.length-1;
    	while(a<=b) {
    		if(digits[a] != digits[b]) {
    			return false;
    		}
    		a++;
    		b--;
    	}
    	return true;
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
    
    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }
    
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }
    
    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int[] digits = getDigits(n);
        System.out.println("Digit Count: " + countDigit(n));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number? " + duckInt(digits));
        System.out.println("Armstrong Number? " + armStrong(n, digits));
        System.out.println("Smallest Digit: " + smallest(digits));
        System.out.println("Largest Digit: " + largest(digits));
        System.out.println("Sum of Digits: " + sum(digits));
        System.out.println("Sum of Squares: " + sumOfSqr(digits));
        System.out.println("Harshad Number? " + harshadNum(digits, n));
        
        int[][] freq = frequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
            }
        }
        
        System.out.println("Palindrome? " + isPalindrome(digits));
        System.out.println("Prime? " + isPrime(n));
        System.out.println("Neon? " + isNeon(n));
        System.out.println("Spy? " + isSpy(n));
        System.out.println("Buzz? " + isBuzz(n));
        System.out.println("Perfect? " + isPerfect(n));
        System.out.println("Abundant? " + isAbundant(n));
        System.out.println("Deficient? " + isDeficient(n));
        System.out.println("Strong? " + isStrong(n));

        sc.close();
    }
}
