package account;

import org.junit.Assert;


class accountTest {


    @org.junit.jupiter.api.Test
    void getUsername() {
        account test = new account("givanstaub", "#1Geheim", "givan@hotmail.com");
        Assert.assertEquals("givanstaub", test.getUsername());
    }

    @org.junit.jupiter.api.Test
    void getWachtwoord() {
        account test = new account("givanstaub", "#1Geheim", "givan@hotmail.com");
        Assert.assertEquals("#1Geheim", test.getWachtwoord());
    }
    @org.junit.jupiter.api.Test
    void getEmail() {
        account test = new account("givanstaub", "#1Geheim", "givan@hotmail.com");
        Assert.assertEquals("givan@hotmail.com", test.getEmail());
    }
}