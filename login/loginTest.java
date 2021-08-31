package login;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loginTest {

    @Test
    void loginAccount() {
        login login = new login("admin","admin");
        Assert.assertEquals(true, database.database.getInstance().isLoggedIn());

        database.database.getInstance().logUit();
    }
    @Test
    void loginContentAccount(){

        login login = new login("Jordy", "isCool");
        Assert.assertEquals(true, database.database.getInstance().isLoggedIn());
        database.database.getInstance().logUit();
    }



}