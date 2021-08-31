package account;

import rankingSysteem.ranking;

import java.util.ArrayList;

public class account {
    private String username;
    private String wachtwoord;
    private String email;

    private ArrayList<ranking> subscribedAccounts;


    public account(String username, String wachtwoord, String email) {
        this.username = username;
        this.wachtwoord = wachtwoord;
        this.email = email;
        this. subscribedAccounts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<ranking> getSubscribedAccounts() {
        return subscribedAccounts;
    }
    public void addSubscribedAccounts(ranking ranking){
        subscribedAccounts.add(ranking);
    }

}
