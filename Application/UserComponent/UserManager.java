package UserComponent;

public class UserManager {
    DataSource dataSource;

    public User registerUser(String username, String password, String email, String phoneString) {
        if (confirmUserDetails) {
            return new User();
        }
    }

    public User loginUser(String username, String password) {
        return new User();
    }

    public void logoutUser(User user) {
    }

    // Used to verify login and register details
    public boolean confirmUserDetails() {
        return true / false;
    }

    // Updates user info in database
    public void updateUser(User user) {
    }

    public void remindPremiumUser() {

    }

    // Checks if a user is already logged in
    public boolean singleSession(User user) {
        return true / false;
    }
}
