package StringBuilderAndBuffer;

public class ComparisonBufferAndBuilder {
	public static void main(String[] args) {
        int iterations = 1_000_000;

        StringBuilder sb = new StringBuilder();
        long startSb = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("hello");
        }
        long endSb = System.nanoTime();
        long timeSb = endSb - startSb;

        StringBuffer sf = new StringBuffer();
        long startSf = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sf.append("hello");
        }
        long endSf = System.nanoTime();
        long timeSf = endSf - startSf;

        System.out.println("Time taken by StringBuilder: " + (timeSb / 1_000_000.0) + " ms");
        System.out.println("Time taken by StringBuffer: " + (timeSf / 1_000_000.0) + " ms");
    }
}
