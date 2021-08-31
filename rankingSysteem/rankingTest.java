package rankingSysteem;

import account.account;
import account.contentcreatorAccount;
import database.database;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rankingTest {

    @Test
    void testRanking(){

        account testAccount = new account("test", "test", "test@test");
        database.getInstance().addAccount(testAccount);

        contentcreatorAccount contentTestAccount = new contentcreatorAccount("test","test", "test@test.com");
        contentTestAccount.setAccountInfo("Test");
        contentTestAccount.setSubscribers(5);
        database.getInstance().addcontentAccount(contentTestAccount);

        ranking testRanking = new ranking("test");

        testAccount.addSubscribedAccounts(testRanking);


        // test of de subscribecount omhoog is gegaan van de testcontent account
        for (int i = 0; i < database.getInstance().getContentAccounts().size(); i++) {
            if (database.getInstance().getContentAccounts().get(i).getUsername().equals("test")) {
                Assert.assertEquals(6,database.getInstance().getContentAccounts().get(i).getSubscribers());
            }
        }


        // test of alle gegevens door zijn gekoment wanneer de ranking gekoppeld wordt aan test

        for (int i = 0; i < testAccount.getSubscribedAccounts().size(); i++) {
            if (testAccount.getSubscribedAccounts().get(i).getSubscribed().equals("test")) {
                Assert.assertEquals("test",testAccount.getSubscribedAccounts().get(i).getSubscribed());
                Assert.assertEquals("Bronze",testAccount.getSubscribedAccounts().get(i).getRank());
                Assert.assertEquals(0,testAccount.getSubscribedAccounts().get(i).getMonthsPassed());
                Assert.assertEquals("31 August 2021",testAccount.getSubscribedAccounts().get(i).getDateSubscribed());
            }
            else{
                System.out.println("er is geen account detect");
            }
        }
    }
}