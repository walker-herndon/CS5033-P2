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

    public boolean confirmUserDetails() {
        return true / false;
    }

    public void updateUser(User user) {
    }

    public void remindPremiumUser() {

    }

    public boolean singleSession(User user) {
        return true / false;
    }
}
