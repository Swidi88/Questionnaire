import java.util.Scanner;

public class Main {

        public static void main (String[] args)  {
            Scanner input = new Scanner(System.in);

            System.out.println("Добро пожаловать в программу анкетирования люде возрастом от 15 до 80 лет.");

            System.out.print("Введите ваше ФИО: ");
            String fullName = input.nextLine();
            while (!isFullNameValid(fullName)) {
                System.out.print("Некорректный ввод. Пожалуйста, введите ваше ФИО: ");
                fullName = input.nextLine();
            }

            System.out.print("Введите ваш возраст: ");
            int age = Integer.parseInt(input.nextLine());
            while (!isAgeValid(age)) {
                System.out.print("Некорректный ввод. Пожалуйста, введите ваш возраст: ");
                age = Integer.parseInt(input.nextLine());
            }

            System.out.print("Введите ваше увлечение: ");
            String hobby = input.nextLine();
            while (!isHobbyValid(hobby)) {
                System.out.print("Некорректный ввод. Пожалуйста, введите ваше увлечение: ");
                hobby = input.nextLine();
            }

            System.out.println("Благодарим вас за заполнение анкеты!");
        }

    public static boolean isFullNameValid(String fullName) {
        return fullName.matches("^[A-Za-zА-Яа-я]+\\s[A-Za-zА-Яа-я]+(\\s[A-Za-zА-Яа-я]+)?$");
    }

    public static boolean isAgeValid(int age) {
        return age >= 15 && age <= 80;
    }

    public static boolean isHobbyValid(String hobby) {
        return hobby.length() > 0 && hobby.length() <= 50;
    }
}