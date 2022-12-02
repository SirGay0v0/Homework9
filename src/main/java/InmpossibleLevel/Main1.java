package InmpossibleLevel;


import InmpossibleLevel.People.PeopleCreate;
import InmpossibleLevel.Threads.ThreadConsole;
import InmpossibleLevel.Threads.ThreadPlusBalance;

public class Main1 {
    public static void main(String[] args) {

        ThreadConsole threadConsole = new ThreadConsole();
        ThreadPlusBalance threadPlusBalance = new ThreadPlusBalance();
        Thread console = new Thread(threadConsole);
        Thread plus = new Thread(threadPlusBalance);
        console.start();

    }
}
