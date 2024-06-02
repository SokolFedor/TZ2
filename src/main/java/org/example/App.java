package org.example;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class App {

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        List<BigInteger> numbers = readNumbersFromFile(fileName);

        if (numbers.isEmpty()) {
            System.out.println("Файл пустой или содержит некорректные данные.");
            return;
        }

        System.out.println("Минимальное число: " + _min(numbers));
        System.out.println("Максимальное число: " + _max(numbers));
        System.out.println("Сумма всех чисел: " + _sum(numbers));
        System.out.println("Произведение всех чисел: " + _mult(numbers));
    }

    public static List<BigInteger> readNumbersFromFile(String fileName) {
        List<BigInteger> numbers = new ArrayList<>();
        ClassLoader classLoader = App.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {
            assert inputStream != null;
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()) {
                String[] numberStrings = scanner.nextLine().split(" ");
                for (String numberString : numberStrings) {
                    try {
                        numbers.add(new BigInteger(numberString));
                    } catch (NumberFormatException e) {
                        System.err.println("Некорректное число: " + numberString);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        return numbers;
    }

    public static BigInteger _min(List<BigInteger> numbers) {
        BigInteger min = numbers.get(0);
        for (BigInteger number : numbers) {
            if (number.compareTo(min) < 0) {
                min = number;
            }
        }
        return min;
    }

    public static BigInteger _max(List<BigInteger> numbers) {
        BigInteger max = numbers.get(0);
        for (BigInteger number : numbers) {
            if (number.compareTo(max) > 0) {
                max = number;
            }
        }
        return max;
    }

    public static BigInteger _sum(List<BigInteger> numbers) {
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger number : numbers) {
            sum = sum.add(number);
        }
        return sum;
    }

    public static BigInteger _mult(List<BigInteger> numbers) {
        BigInteger mult = BigInteger.ONE;
        for (BigInteger number : numbers) {
            mult = mult.multiply(number);
        }
        return mult;
    }
}
