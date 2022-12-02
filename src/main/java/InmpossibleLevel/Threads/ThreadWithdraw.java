package InmpossibleLevel.Threads;

import InmpossibleLevel.People.PeopleCreate;

import java.util.Scanner;

public class ThreadWithdraw implements Runnable {
    public void withdrawBalance(PeopleCreate withdrawAcc) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваш баланс: " + withdrawAcc.getBalance());
        System.out.print("Выберете сумму: ");
        int money = scanner.nextInt();
        scanner.nextLine();
        if (withdrawAcc.getBalance() < money) {
            System.out.println("На этом счете недостаточно средств");
            withdrawBalance(withdrawAcc);
        } else {
            withdrawAcc.setBalance(withdrawAcc.getBalance() - money);
            System.out.println("Ваш баланс: " + withdrawAcc.getBalance());
        }
    }

    @Override
    public void run() {
        ThreadWithdraw threadWithdraw = new ThreadWithdraw();
        PeopleCreate peopleCreate = new PeopleCreate();
        threadWithdraw.withdrawBalance(peopleCreate);
    }
}
