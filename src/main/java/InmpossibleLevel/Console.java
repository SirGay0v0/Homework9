package InmpossibleLevel;

import java.util.Scanner;

public class Console {
    static boolean quit = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Выберете опцию:");
            System.out.println("1. Перевод денег другому клиенту.");
            System.out.println("2. Снять деньги.");
            System.out.println("3. Выход");
            String choose = scanner.nextLine();
            scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Вы");
                    System.out.println("2. Снять деньги.");
                case "2":
                    System.out.println("Выберете персонажа:");
                    System.out.println("1. Clara");
                    System.out.println("1. Denis");

                case "3":
                    quit = true;
            }
        } while (quit == false);
    }
}