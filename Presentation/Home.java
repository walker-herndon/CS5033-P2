package Presentation;
import javax.swing.*;

public class Home extends JFrame {
    // create projects
    // view all your projects
    public Home() {
        JComponent navigation = new JComponent() {
            // navigation logic
        };
        
        JPanel projectList = new JPanel();
        JButton createProject = new JButton();
        
        JComponent projectCreationModal = new JComponent() {
            // project creation logic and fields 
        };
        
        
        setVisible(true);
    }
}
