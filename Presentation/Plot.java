package Presentation;
import javax.swing.*;

public class Plot extends JFrame {

    public Plot () {
        JComponent navigation = new JComponent() {
            // Navigation logic
        };

        JComponent visualisations = new JComponent() {
            // Visualisation(s) of the plot and chapters it contains
        };

        JComponent editor = new JComponent() {
            //Several buttons to edit the plot here through an editor object for example:
            //Add a chapter
            JButton addChapter = new JButton();

            //Remove a chapter
            JButton removeChapter = new JButton(/* Selected chapter */);

            //Edit a chapter - Brings the user to the chapter page
            JButton editChapter = new JButton(/* Selected chapter */);
        };

        JComponent versionControl = new JComponent() {
            //Several buttons to invoke version control methods here for example:
            JButton pull = new JButton();
            JButton push = new JButton();
            JButton merge = new JButton();
            JButton branch = new JButton();
            JButton log = new JButton();
        };
    }
}