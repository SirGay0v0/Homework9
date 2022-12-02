package InmpossibleLevel.Threads;

import InmpossibleLevel.People.PeopleCreate;

public class ThreadPlusBalance implements Runnable {
    @Override
    public void run() {
        Replenishment replenishment = new Replenishment();
        ThreadConsole threadConsole = new ThreadConsole();

        replenishment.replenishment(threadConsole.clara);
        replenishment.replenishment(threadConsole.denis);
    }

    public class Replenishment {
        public void replenishment(PeopleCreate peopleCreate) {
            for (; ; ) {
                peopleCreate.setBalance(peopleCreate.getBalance() + 50);
            }
        }
    }
}