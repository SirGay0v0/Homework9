package InmpossibleLevel.Threads;

import InmpossibleLevel.Main1;
import InmpossibleLevel.People.PeopleCreate;

import java.util.Scanner;

public class ThreadConsole implements Runnable {
    PeopleCreate clara =  new PeopleCreate("Clara", 9314857, 1000);
    PeopleCreate denis = new PeopleCreate("Denis", 1348567, 1000);
    public void threadConsole() {

        PeopleCreate peopleCreate = new PeopleCreate();
        ThreadTranslation threadTranslation = new ThreadTranslation();
        ThreadWithdraw threadWithdraw = new ThreadWithdraw();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        do {
            System.out.print("Выберете опцию:");
            System.out.println("1. Перевод денег другому клиенту.");
            System.out.println("2. Снять деньги.");
            System.out.println("3. Выход");
            System.out.println(":");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Выберете отправителя:");
                    System.out.println("1. Clara");
                    System.out.println("2. Denis");
                    int senderAcc, recepientAcc;
                    System.out.println(":");
                    int sender = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Выберете получателя:");
                    if (sender == 1) {
                        senderAcc = clara.getAccount();
                        recepientAcc = denis.getAccount();
                        System.out.println("1. Denis");
                    } else {
                        senderAcc = denis.getAccount();
                        recepientAcc = clara.getAccount();
                        System.out.println("1. Clara");
                    }
                    threadTranslation.translation(senderAcc, recepientAcc);

                case 2:
                    System.out.println("Выберете персонажа:");
                    System.out.println("1. Clara");
                    System.out.println("1. Denis");
                    int withdraw = scanner.nextInt();
                    PeopleCreate withdrawAcc;
                    scanner.nextLine();
                    if (withdraw == 1) {
                        withdrawAcc = clara;
                    } else {
                        withdrawAcc = denis;
                    }
                    threadWithdraw.withdrawBalance(withdrawAcc);
                case 3:
                    quit = true;
            }
        } while (quit == false);
    }

    @Override
    public void run() {
        ThreadConsole threadConsole = new ThreadConsole();
        threadConsole.threadConsole();
    }
}

