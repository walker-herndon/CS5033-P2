/**
 * (Package-private) class for plot version control
 */
package PlotManagement;

class VersionControl {

    private Plot plot;

    public VersionControl() {
        this(null);
    }

    public VersionControl(Plot plot) {
        this.plot = plot;
    }

    public Plot getPlot() {
        return this.plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public Chapters pull(int chapterID) {
        //Returns the latest version of the chapters under chapterID
        return null;
    }

    public boolean push(String commitMsg, Chapters local) {
        //Tries to push local changes to remote version, if conflicts - prompt merge or branch
        return true;
    }

    public boolean merge(Chapters local, int chapterID) {
        //Merge local chapter with remote chapter (under chapterID)
        return true;
    }

    public boolean branch(int chapterID) {
        //Create a branch from chapter under chapterID
        return true;
    }

    public boolean revert(int chapterID) {
        //Revert a change made to chapter under chapterID (pushes old change)
        return true;
    }

    public String log() {
        //Gets project history from db of all chapters
        return "";
    }
}