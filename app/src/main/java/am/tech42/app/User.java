package am.tech42.app;

public class User {
    private char[] password;
    private char[] username;
    
    public void setPassword(char[] password) {
        this.password = password;
    }

    public void setUsername(char[] username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public char[] getUsername() {
        return username;
    }
}