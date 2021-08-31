package account;

public class contentcreatorAccount extends account{

    private String accountInfo;
    private int subscribers;


    public contentcreatorAccount(String username, String wachtwoord, String email) {
        super(username, wachtwoord, email);
    }

    public void setAccountInfo(String accountInfo) {
        this.accountInfo = accountInfo;
    }
    public String getAccountInfo() {
        return accountInfo;
    }

    public int getSubscribers() {
        return subscribers;
    }
    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }
}
