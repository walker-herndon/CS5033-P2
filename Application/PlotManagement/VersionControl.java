/**
 * (Package-private) class for plot version control
 */
package PlotManagement;

import java.util.ArrayList;

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

    public ArrayList<Chapters> pull() {
        return this.plot.getChapters();
    }

    public boolean push(String commitMsg, Chapters local) {
        //Tries to push local changes to remote version, if conflicts - prompt (local) merge or branch
        return true;
    }

    public boolean merge(int branch1, int branch2) {
        //Merge two (remote) branches using their chapter ID's
        return true;
    }

    public boolean branch(int chapter, Chapters branch) {
        //Branch from chapter (ID) with local branch
        return true;
    }

    public boolean revert(int chapter) {
        //Revert a change made to chapter using its ID (pushes old change)
        return true;
    }

    public String log() {
        //Gets project history from db of all chapters
        return "";
    }
}