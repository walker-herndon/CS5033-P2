package Presentation;
import javax.swing.*;

public class ProjectDisplay extends JFrame {
    // view project details 
    // send to publisher
    // export project
    
    public ProjectDisplay() {
        JComponent navigation = new JComponent() {
            // navigation logic
        };

        JComponent projectView = new JComponent() {
            // project information 
        };

        JButton findProjectIllustrator = new JButton();

        JComponent publisherDistribution = new JComponent() {
            // publisher sending logic (API call)
        };

        JComponent exportProject = new JComponent() {
            // export logic 
        };

        setVisible(true);
    }
}
