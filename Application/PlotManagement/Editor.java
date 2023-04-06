/**
 * (Package-private) class for editing plots
 */
package PlotManagement;

class Editor {

    private Plot plot;
    private int userID;

    public Editor() {
        this(null, -1);
    }

    public Editor(Plot plot, int userID) {
        this.plot = plot;
        this.userID = userID;
    }

    public Plot getPlot() {
        return this.plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public boolean addChapter(int prev, int next) {
        return true;
    }

    public boolean removeChapter(int chapter) {
        return true;
    } 

    public boolean editChapter(int chapter, Chapters edit) {
        return true;
    }

}