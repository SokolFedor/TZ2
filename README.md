# Описание

Описание App
Данная программа проект представляет собой простую программу на Java, которая читает числа из файла `numbers.txt`, вычисляет некоторые статистические характеристики этих чисел и выводит результаты на консоль.

# Использование
1. Поместите файл `numbers.txt` в директорию ресурсов проекта.
2. Запустите приложение, выполнив метод `main` класса `App`.
3. Программа выведет на консоль минимальное число, максимальное число, сумму всех чисел и произведение всех чисел из файла `numbers.txt`.
# Результаты
Пример работы программы:
Минимальное число: -10
Максимальное число: 100
Сумма всех чисел: 210
Произведение всех чисел: -7000000
# Важное замечание
В случае пустого файла или наличия некорректных данных программа выведет соответствующее сообщение об ошибке.


Описание AppTest
Данная программа содержит модульные тесты для проверки четырех основных методов в классе `App`, которые работают с числами типа `BigInteger`: `_min`, `_max`, `_sum` и `_mult`. Каждый тест проверяет корректность работы соответствующего метода на различных входных данных.

1. **test_min()**: Проверяет метод `_min` на корректность нахождения минимального числа в списке чисел.
2. **test_max()**: Проверяет метод `_max` на корректность нахождения максимального числа в списке чисел.
3. **test_sum()**: Проверяет метод `_sum` на корректность вычисления суммы всех чисел в списке.
4. **test_mult()**: Проверяет метод `_mult` на корректность вычисления произведения всех чисел в списке.



Описание AppSpeedTest
Этот проект содержит тесты производительности для оценки времени выполнения основных методов в классе `App`, работающих с числами типа `BigInteger`. Методы, подвергаемые тестированию, включают в себя: `_min`, `_max`, `_sum` и `_mult`. Каждый тест запускается с различными размерами входного файла, чтобы оценить производительность методов на разных объемах данных.
Метод testPerformance() тестирует время выполнения каждого из четырех основных методов (`_min`, `_max`, `_sum`, `_mult`) на разных размерах входного файла. Размеры файлов варьируются от 1000 до 100 000 чисел.
