package org.example;

import org.junit.Test;
import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class AppSpeedTest {

    private void generateFile(String fileName, int numIntegers) throws IOException {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            Random random = new Random();
            for (int i = 0; i < numIntegers; i++) {
                writer.print(random.nextInt(100) + " ");
            }
        }
    }

    @Test
    public void testPerformance() {
        int[] fileSizes = {1000, 5000, 10000, 50000, 100000};

        for (int size : fileSizes) {
            try {
                String fileName = "test_" + size + ".txt";
                generateFile(fileName, size);

                List<BigInteger> numbers = readNumbersFromFile(fileName);
                long startTime, endTime;

                startTime = System.currentTimeMillis();
                App._min(numbers);
                endTime = System.currentTimeMillis();
                System.out.println("Размер: " + size + ", Время выполнения _min: " + (endTime - startTime) + " мс");

                startTime = System.currentTimeMillis();
                App._max(numbers);
                endTime = System.currentTimeMillis();
                System.out.println("Размер: " + size + ", Время выполнения _max: " + (endTime - startTime) + " мс");

                startTime = System.currentTimeMillis();
                App._sum(numbers);
                endTime = System.currentTimeMillis();
                System.out.println("Размер: " + size + ", Время выполнения _sum: " + (endTime - startTime) + " мс");

                startTime = System.currentTimeMillis();
                App._mult(numbers);
                endTime = System.currentTimeMillis();
                System.out.println("Размер: " + size + ", Время выполнения _mult: " + (endTime - startTime) + " мс");

            } catch (IOException e) {
                System.err.println("Ошибка при создании файла: " + e.getMessage());
            }
        }
    }

    private List<BigInteger> readNumbersFromFile(String fileName) throws IOException {
        List<BigInteger> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                numbers.add(new BigInteger(scanner.next()));
            }
        }
        return numbers;
    }
}
