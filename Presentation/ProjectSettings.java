package Presentation;
import javax.swing.*;

public class ProjectSettings extends JFrame {
    // edit project details 
    // change permissions
    // delete project 
    public ProjectSettings() {
        JComponent navigation = new JComponent() {
            // navigation logic
        };

        JComponent projectEditing = new JComponent() {
            // project detail editing logic
        };

        JComponent permissionControl = new JComponent() {
            // permission control logic 
        };

        JButton deleteProject = new JButton();

        setVisible(true);
    }
}
