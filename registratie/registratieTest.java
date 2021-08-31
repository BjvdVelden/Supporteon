package registratie;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
class registratieTest {
    @Test
    void testCases() {
        registratie registratie = new registratie();
        //testcase 1
        Assert.assertFalse(registratie.checkIfCorrect("ditzijnmeerdan21tekens", "verkeerdwachtwoord"));
        //testcase 2
        Assert.assertFalse(registratie.checkIfCorrect("Bram", "verkeerdwachtwoord"));
        //testcase 3
        Assert.assertFalse(registratie.checkIfCorrect("ditzijnmeerdan21tekens", "#1Geheim"));
        //testcase 4
        Assert.assertTrue(registratie.checkIfCorrect("Bram", "#1Geheim"));
    }
}



