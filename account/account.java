package account;

public class account {
    private String username;
    private String wachtwoord;
    private String email;

    private boolean isEmailVerified;

    public account(String username, String wachtwoord, String email) {
        this.username = username;
        this.wachtwoord = wachtwoord;
        this.email = email;
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
}
