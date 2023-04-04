package ProjectManagement;
import UserComponent.*;
import java.util.*;

public class Permissions {
    List<User> collaborators;

    public boolean shareProject(User u) {
        return true;
    }

    public boolean isPremiumUser(User u) {
        return true;
    }

    public boolean revokeSharing(User u) {
        return true;
    }
}
