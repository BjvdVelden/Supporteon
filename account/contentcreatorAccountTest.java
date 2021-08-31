package account;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class contentcreatorAccountTest {

    @Test
    void AccountInfo() {
        contentcreatorAccount test = new contentcreatorAccount ("givanstaub", "#1Geheim", "givan@hotmail.com");

        test.setAccountInfo("Dit is een persoon die houd van koekjes bakken en maakt videos ervan online");
        Assert.assertEquals("Dit is een persoon die houd van koekjes bakken en maakt videos ervan online", test.getAccountInfo());

    }

    @Test
    void Subscribers() {
        contentcreatorAccount test = new contentcreatorAccount ("givanstaub", "#1Geheim", "givan@hotmail.com");

        test.setSubscribers(10);
        Assert.assertEquals(10, test.getSubscribers());

    }
}