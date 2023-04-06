/**
 * Defined within Plot management package
 */
package PlotManagement;

/**
 * import the ArrayList class - Implementation for "*" for multiplicities in UML
 */
import java.util.ArrayList;

/**
 * (Package-private) class for plot version control
 */
class VersionControl {

    //Associated plot to manage the versions of
    private Plot plot;

    /**
     * Empty constructor, creates a version control object with no associated plot
     */
    public VersionControl() {
        this(null);
    }

    /**
     * Constructor for a version control object for a plot
     * @param plot Plot
     */
    public VersionControl(Plot plot) {
        this.plot = plot;
    }

    /**
     * Gets plot which is managed by this version control object
     * @return Plot
     */
    public Plot getPlot() {
        return this.plot;
    }

    /**
     * Sets the plot which is managed by this version control object
     * @param plot plot
     */
    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    /**
     * Pulls the updated plot (and all its versions)
     * @param userID User ID of the User invoking this method
     * @return A list containing different lists of chapters (versions of plots)
     */
    public ArrayList<Chapters> pull(int userID) {
        return this.plot.getChapters();
    }

    /**
     * Tries to push local changes to remote version, (if conflicts - returns false, prompt (local) merge or branch in presentation layer)
     * @param userID User ID of the User invoking this method
     * @param commitMsg Commit message
     * @param local Local chapters to push
     * @return Whether the operation was successful
     */
    public boolean push(int userID, String commitMsg, ArrayList<Chapters> local) {
        return true;
    }

    /**
     * Merge two (remote) branches using their chapter ID's
     * @param userID User ID of the User invoking this method
     * @param branch1 ID of first branch to merge
     * @param branch2 ID of second branch to merge
     * @return Whether the operation was successful
     */
    public boolean merge(int userID, int branch1, int branch2) {
        return true;
    }

    /**
     * Branch from chapter (ID) with local branch
     * @param userID User ID of the User invoking this method
     * @param chapter ID of Chapter to branch from
     * @param branch Local chapters in the new branch
     * @return Whether the operation was successful
     */
    public boolean branch(int userID, int chapter, Chapters branch) {
        return true;
    }

    /**
     * Revert a change made to chapter using its ID (pushes old change)
     * @param userID User ID of the User invoking this method
     * @param chapter ID of Chapter to revert changes from
     * @return
     */
    public boolean revert(int userID, int chapter) {
        return true;
    }

    /**
     * Gets project history from db of all chapters
     * @return A string containing the plot version history
     */
    public String log() {
        return "";
    }
}