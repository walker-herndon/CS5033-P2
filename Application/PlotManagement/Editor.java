/**
 * (Package-private) class for editing plots
 */
package PlotManagement;

class Editor {

    private Plot plot;

    public Editor() {
        this(null);
    }

    public Editor(Plot plot) {
        this.plot = plot;
    }

    public Plot getPlot() {
        return this.plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
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