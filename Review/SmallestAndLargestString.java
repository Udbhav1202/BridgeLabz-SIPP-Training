package Review;

public class SmallestAndLargestString {

    public static void main(String[] args) {
        String[] str = {"java", "is", "Language"};

        int max = 0;
        int min = 0;

        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > str[max].length()) {
                max = i;
            }
            if (str[i].length() < str[min].length()) {
                min = i;
            }
        }

        System.out.println("Largest : " + str[max]);
        System.out.println("Smallest : " + str[min]);
    }
}
