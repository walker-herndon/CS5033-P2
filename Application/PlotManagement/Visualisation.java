/**
 * Defined within Plot management package
 */
package PlotManagement;

/**
 * (Package-private) class for visualising plots
 */
class Visualisation {

    //Default order of visualisation objects - by chapter
    public static final StoryOrder DEFAULT_ORDER = StoryOrder.Chapter;

    //plot to visualise
    private Plot plot;

    //how the chapters should be ordered
    private StoryOrder sort;

    /**
     * Empty constructor for a visualisation of a plot, in default order
     */
    public Visualisation() {
        this(DEFAULT_ORDER);
    }

    /**
     * Constructor for a visualisation object for a plot
     * @param sort The order of chapters
     */
    public Visualisation(StoryOrder sort) {
        this.sort = sort;
    }

    /**
     * Gets plot object associated with the visualisation
     * @return Plot
     */
    public Plot getPlot() {
        return this.plot;
    }

    /**
     * Sets plot object associated with the visualisation
     * @param plot Plot
     */
    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    /**
     * Gets the order of chapters shown in the visualisation
     * @return (Sort) order of the chapters within the visualisation
     */
    public StoryOrder getSort() {
        return this.sort;
    }

    /**
     * Sets the order of chapters shown in the visualisation
     * @param sort (Sort) order of the chapters within the visualisation
     */
    public void setSort(StoryOrder sort) {
        this.sort = sort;
    }

    /**
     * Returns an object which can be used to visualise the plot and all its versions
     * @return Plot visualisation
     */
    public Object showPlot() {
        return null;
    }

    /**
     * Returns an object which can be used to visualise a single version of the plot
     * @param branch Version of the plot
     * @return Plotline visualisation
     */
    public Object showStory(int branch) {
        return null;
    }

}