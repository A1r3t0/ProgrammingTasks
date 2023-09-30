import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a: ");
        String one = reader.readLine();
        System.out.println("Введите число b: ");
        String two = reader.readLine();
        int a = Integer.parseInt(one);
        int b = Integer.parseInt(two);
        int max, min;
        if (a>b) {
            max = a;
            min = b;
        }
        else if (a<b) {
            max = b;
            min = a;
        }
        else {
            max = a;
            min = a;
        }
        System.out.println("Сумма введенных чисел: " +(a+b));
        System.out.println("Разность a и b: " + (a-b));
        System.out.println("Произведение введенных чисел: "+(a*b));
        System.out.println("Среднее арифметическое двух чисел: "+(((double) a+b)/2));
        System.out.println("Разность максимального и минимального: "+(max-min));

    }
} 