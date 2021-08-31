package login;

import account.account;
import database.database;
import account.contentcreatorAccount;
import java.util.ArrayList;

public class login {

    public login(String username, String wachtwoord){
        ArrayList<account> accountLijst = database.getInstance().getAccounts();
        ArrayList<contentcreatorAccount> contentaccountLijst = database.getInstance().getContentAccounts();



        for (int i = 0; i < accountLijst.size(); i++){

            if(accountLijst.get(i).getUsername().equals(username) & accountLijst.get(i).getWachtwoord().equals(wachtwoord)){
                database.getInstance().setLoggedIn(true);
            }
        }

        for (int i = 0; i < contentaccountLijst.size(); i++){
            if(contentaccountLijst.get(i).getUsername().equals(username) & contentaccountLijst.get(i).getWachtwoord().equals(wachtwoord)){
                database.getInstance().setLoggedIn(true);
            }
        }

        if (database.getInstance().isLoggedIn()) {
            System.out.println("Welkom!");
        }else{
            System.out.println("Het is niet gelukt >:(");
        }
    }
    public void loguit(){
        database.getInstance().setLoggedIn(false);
    }
}
