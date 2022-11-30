package InmpossibleLevel;

public class PeopleCreate {
    private String name;
    private int account;

    public PeopleCreate(String name, int account) {
        this.name = name;
        this.account = account;
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
