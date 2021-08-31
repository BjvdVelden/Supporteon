package database;

import account.account;
import account.contentcreatorAccount;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class databaseTest {

    @Test
    void addAccount() {

        account test = new account("test", "test", "test@test");
        database.getInstance().addAccount(test);
        ArrayList<account>testdata = database.getInstance().getAccounts();


        for (int i = 0; i < testdata.size(); i++){
            if (testdata.get(i).getUsername().equals("test")){
                Assert.assertEquals("test",testdata.get(i).getUsername());
            }
        }
    }
    @Test
    void addContentAccount(){
        contentcreatorAccount test2 = new contentcreatorAccount("test", "test", "test@test");
        database.getInstance().addcontentAccount(test2);
        ArrayList<contentcreatorAccount>data = database.getInstance().getContentAccounts();



        for (int i = 0; i < data.size(); i++){
            if (data.get(i).getUsername().equals("test")){
                Assert.assertEquals("test",data.get(i).getUsername());
            }
        }
    }
}