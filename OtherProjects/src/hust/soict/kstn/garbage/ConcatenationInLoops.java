
package hust.soict.kstn.garbage;

public class ConcatenationInLoops {
    private static final int N = 10000;

    public static void main(String[] args) {
        // 1. Using +
        long start = System.nanoTime();
        String s = "";

        for (int i = 0; i < N; i++) {
            s += "A";
        }

        long end = System.nanoTime();
        System.out.println("String +: " + (end - start) / 1_000_000.0
                + " ms");

        // 2. Using StringBuffer
        start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < N; i++) {
            buffer.append("A");
        }

        end = System.nanoTime();
        System.out.println("StringBuffer: "
                + (end - start) / 1_000_000.0 + " ms");

        // 3. Using StringBuilder
        start = System.nanoTime();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            builder.append("A");
        }

        end = System.nanoTime();
        System.out.println("StringBuilder: "
                + (end - start) / 1_000_000.0 + " ms");

        System.out.println("Length: " + s.length());
        System.out.println("Buffer length: " + buffer.length());
        System.out.println("Builder length: " + builder.length());
    }
}
