package InmpossibleLevel.People;

public class PeopleCreate {
    private String name;
    private int account;
    private int balance;


//    public PeopleCreate clara =  new PeopleCreate("Clara", 9314857, 1000);
//    public PeopleCreate denis = new PeopleCreate("Denis", 1348567, 1000);


    public PeopleCreate() {
    }

    public PeopleCreate (String name, int account, int balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

}
