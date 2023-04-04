/**
 * Defined within Plot management package
 */
package PlotManagement;

/**
 * (Package-private) class for visualising plots
 */
class Visualisation {

    public static final StoryOrder DEFAULT_ORDER = StoryOrder.Chapter;

    private Plot plot;
    private StoryOrder sort;

    public Visualisation() {
        this(DEFAULT_ORDER);
    }

    public Visualisation(StoryOrder sort) {
        this.sort = sort;
    }

    public Plot getPlot() {
        return this.plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public StoryOrder getSort() {
        return this.sort;
    }

    public void setSort(StoryOrder sort) {
        this.sort = sort;
    }

    public Object displayChapters() {
        return null;
    }

    public Object displayStory(Chapter story) {
        return null;
    }

}