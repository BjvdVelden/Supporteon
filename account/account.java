package account;

import rankingSysteem.ranking;

import java.util.ArrayList;

public class account {
    private String username;
    private String wachtwoord;
    private String email;

    private ArrayList<ranking> subscribedAccounts;


    public account(String username, String wachtwoord) {
        this.username = username;
        this.wachtwoord = wachtwoord;
        this. subscribedAccounts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }


    public ArrayList<ranking> getSubscribedAccounts() {
        return subscribedAccounts;
    }
    public void addSubscribedAccounts(ranking ranking){
        subscribedAccounts.add(ranking);
    }

}
