package UserComponent;

public class User {
    int id;
    String username;
    byte[] passwordHash;
    String email;
    boolean subscribed;

    public int getUserId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.passwordHash = password.getBytes();
    }

    public boolean verifyPassword(String password) {
        return passwordHash == password.getBytes();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscription(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public boolean singleSession() {
        return true;
    }
}