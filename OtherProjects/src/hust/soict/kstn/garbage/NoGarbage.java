
package hust.soict.kstn.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: NoGarbage <file-path>");
            return;
        }

        StringBuffer content = new StringBuffer();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(args[0]))) {
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append('\n');
            }

            System.out.println("File read successfully.");
            System.out.println("Characters: " + content.length());
            System.out.println("Memory used: "
                    + (Runtime.getRuntime().totalMemory()
                    - Runtime.getRuntime().freeMemory()) / (1024 * 1024)
                    + " MB");

        } catch (IOException e) {
            System.err.println("Cannot read file: " + e.getMessage());
        }
    }
}
