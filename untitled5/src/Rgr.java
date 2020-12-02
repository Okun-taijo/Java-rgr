
import java.util.Scanner;

public class Rgr  {
    public static void main(String[] args) throws MyException{
        Rgr.someMathCountingMachine();
    }

    private static void someMathCountingMachine() throws MyException {
        int counter;
        double sum=0;
        double min=0;
        double mult=1;
        double div=1;
        int[] Massive = {};
        Massive = new int[50];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество чисел, которые хотите посчитать(не более 50(при вводе 50 программа остановит работу))");
        counter = scanner.nextInt();
        while (counter<=50) {
            counter = scanner.nextInt();
            try {
                if (counter > 50) {
                    throw new MyException();
                } else {
                    for (int i = 0; i < counter; i++) {
                        System.out.println("Введите ваше число");
                        Massive[i] = scanner.nextInt();
                        sum = sum + Massive[i];
                        min = min - Massive[i];
                        mult = mult * Massive[i];
                        div = div / Massive[i];
                    }
                    System.out.println("Результат суммирования ваших чисел: " + sum);
                    System.out.println("Результат отнимания всех чисел: " + min);
                    System.out.println("Результат умножения всех чисел: " + mult);
                    System.out.println("Результат деления единицы на все числа: " + div);

                }

            } catch (MyException myException) {
                System.out.println("ТЕБЕ РУССКИМ ЯЗЫКОМ НАПИСАНО НЕ БОЛЕЕ 50");

            }
        }

    }
}
