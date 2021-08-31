package database;


import account.account;
import account.contentcreatorAccount;

import java.util.ArrayList;

public class database {

    private static database singleton = null;
    private ArrayList<account> accounts;
    private ArrayList<contentcreatorAccount> contentAccounts;

    private boolean isLoggedIn;


    private database() {
        this.accounts = new ArrayList<>();
        this.contentAccounts = new ArrayList<>();

        account admin = new account("admin", "admin", "admin@admin.com");

        contentcreatorAccount Bob = new contentcreatorAccount("bobiscool","bobdeman", "bob@bob.com");
        Bob.setAccountInfo("Ik maak voor de lol cakejes");
        Bob.setSubscribers(11);

        accounts.add(admin);

        contentcreatorAccount Dennis = new contentcreatorAccount("vZadelhoff","#1Geheim", "DZadelhoff@gmail.com");
        Dennis.setAccountInfo("Ik stream doom eternal gameplay ");
        Dennis.setSubscribers(20);


        contentcreatorAccount Jordy = new contentcreatorAccount("Jordy","isCool", "Jordy");
        Jordy.setAccountInfo("Ik Film mijzelf in de sportschool! CHESTDAY");
        Jordy.setSubscribers(16);




        contentAccounts.add(Dennis);
        contentAccounts.add(Jordy);

    }

    public static database getInstance() {
        if (singleton == null) {
            singleton = new database();
        }
        return singleton;
    }


    public ArrayList<account> getAccounts() {
        return accounts;
    }

    public void addAccount(account account){
        this.accounts.add(account);
    }

    public ArrayList<contentcreatorAccount> getContentAccounts() {
        return contentAccounts;
    }

    public void addcontentAccount(contentcreatorAccount account){
        this.contentAccounts.add(account);
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void logUit(){
        isLoggedIn = false;
    }
}
