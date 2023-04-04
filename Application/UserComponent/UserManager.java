package UserComponent;

public class UserManager {
    DataSource dataSource;

    public User registerUser(String username, String password, String email) {
        return new User();
    }

    public User logniUser(String username, String password) {
        return new User();
    }

    public void updateUser(User user) {
    }

    public void updatePassword(User user, String password) {
    }
}
