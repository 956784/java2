import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Создание объекта Scanner для считывания данных с консоли
        System.out.println("Введите верхний ограничитель: ");
        double max = input.nextDouble();// Считывание введенного значения верхнего ограничителя и сохранение в переменной max
        System.out.println("Введите исходное число: ");
        double x = input.nextDouble();// Считывание введенного значения исходного числа и сохранение в переменной x
        double sum = 0;
        if (Math.abs(x) < max) {// Проверка условия: если абсолютное значение x меньше max
            for (int n = 0; n <= max; n++) {// Цикл для вычисления суммы ряда
                sum += Math.pow(-1, n) * Math.pow(x, n) / factorial(n);// Вычисление каждого слагаемого с использованием формулы заданного рядаи добавление его к общей сумме
            }
            System.out.println(sum);
        }
        else
        {
            System.out.println("ERROR");// Вывод сообщения об ошибке, если условие не выполняется
        }
    }
    public static int factorial (int j) // Метод для вычисления факториала числа
    {
        int f = 1;
        for (int i = 1; i <= j; i++)// Цикл для поочередного умножения чисел от 1 до j
        {
            f *= i;
        }
        return f;
    }
}