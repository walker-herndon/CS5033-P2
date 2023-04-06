/**
 * Defined within Plot management package
 */
package PlotManagement;

/**
 * (Package-private) class for (objects) editing plots
 */
class Editor {

    /**
     * Attributes for an Editor object
     * The plot to be edited
     * The user using the editor object (as specified by their user ID)
     */
    private Plot plot;
    private int userID;

    /**
     * Constructor for a default editor (does not link to any user or plot)
     */
    public Editor() {
        this(null, -1);
    }

    /**
     * Constructor for an editor object
     * @param plot      Plot to be edited
     * @param userID    User ID of the editing user
     */
    public Editor(Plot plot, int userID) {
        this.plot = plot;
        this.userID = userID;
    }

    /**
     * Gets plot being edited
     * @return  Plot
     */
    public Plot getPlot() {
        return this.plot;
    }

    /**
     * Sets plot being edited
     * @param plot  Plot
     */
    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    /**
     * Gets user editing
     * @return userID
     */
    public int getUserID() {
        return this.userID;
    }

    /**
     * Sets user editing
     * @param userID userID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Add a chapter to the plot
     * @param prev ID of previous chapter (-1 if none)
     * @param next ID of next chapter (-1 if none)
     * @return  Whether the operation was successful
     */
    public boolean addChapter(int prev, int next) {
        //May invoke Version Control methods
        return true;
    }

    /**
     * Removes a chapter from the plot
     * @param chapter ID of the chapter to be removed
     * @return Whether the operation was successful
     */
    public boolean removeChapter(int chapter) {
        //May invoke Version Control methods
        return true;
    } 

    /**
     * Edits an existing chapter by replacing it with local edited chapter
     * @param chapter The replacement chapter
     * @param edit  ID of the chapter to be replaced
     * @return Whether the operation was successful
     */
    public boolean editChapter(int chapter, Chapters edit) {
        //May invoke Version Control methods
        return true;
    }

}