import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Добро пожаловать в программу для автоматического" +
                " заполнения шаблонной анкеты. Для этого вам потребуется " +
                "ввести ваши данные.");
        Thread.sleep(4000);
        System.out.println("Введите ваше имя: ");
        String name = reader.readLine();
        System.out.println("Введите ваш возраст: ");
        String age1 = reader.readLine();
        int age = Integer.parseInt(age1);
        int resultAge = 2023-age;
        System.out.println("Введите ваше место (город) проживания: ");
        String cityLiving = reader.readLine();
        System.out.println("Введите страну вашего проживания: ");
        String countryLiving = reader.readLine();
        System.out.println("Уважаемый "+ name + "!");
        System.out.println("На сегодняшний день Вы проживаете в стране " + countryLiving + ", в");
        System.out.println("городе " + cityLiving + ", и вы родились в");
        System.out.println(resultAge + " году.");
    }
} 