package Presentation;

import javax.swing.*;

public class UserProfile extends JFrame {

    public UserProfile() {
        JComponent navigation = new JComponent() {
            // navigation logic
        };

        JButton logout = new JButton();

        JComponent userInformation = new JComponent() {
            // user information pulled from UserManager via API call
        };

        JComponent profileEditing = new JComponent() {
            // profile editing logic
            // Includes password, email, and phone number changing
            // All done through UserManager via API call
        };

        JComponent subscription = new JComponent() {
            // Subscribe or unsubscribe to premium
            // Uses SubscriptionManager API call
            // Subscribing will open the external payment page
        };

        JComponent subscriptionReminder = new JComponent() {
            // Remind user to subscribe to premium
            // Uses SubscriptionManager API call to check if a user is subscribed
        };

        setVisible(true);

    }

}
