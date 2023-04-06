package Presentation;
import java.util.Queue;
import javax.swing.*;

public class Chapter extends JFrame {

    Queue q; //Offline queue to store local changes

    public Chapter() {
        JComponent navigation = new JComponent() {
            // Navigation logic
        };

        JComponent editor = new JComponent() {
            // Chapter editor, constructs chapters to pass into the q into the editChapter method (when connection regained)
        };
    }
}
