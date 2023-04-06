/**
 * Defined within Plot management package
 */
package PlotManagement;

/**
 * Import project details from project management package
 */
import ProjectManagement.Project;

/**
 * import the ArrayList class - Implementation for "*" for multiplicities in UML
 */
import java.util.ArrayList; 

/**
 * public class representing Plot
 */
public class Plot {

    /**
     * Plot attributes
     */
    private Project project;
    private ArrayList<Editor> editors;
    private ArrayList<Visualisation> visualisations;
    private ArrayList<Chapters> chapters; //Chapters and their versions
    private VersionControl versionControl;

    /**
     * Constructor for an empty plot given a project
     * @param project Project corresponding the plot
     */
    public Plot(Project project) {
        this(project, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new VersionControl());
    }

    /**
     * Constructor for a plot object
     * @param project Associated project
     * @param editors Any plot editors
     * @param visualisations Visualisations of the plot
     * @param chapters Chapters making up the plot
     * @param versionControl Version Control for the plot
     */
    public Plot(Project project, ArrayList<Editor> editors, ArrayList<Visualisation> visualisations, ArrayList<Chapters> chapters, VersionControl versionControl) {
        this.project = project;
        this.editors = editors;
        this.visualisations = visualisations;
        this.chapters = chapters;
        this.versionControl = versionControl;
        initialise();
    }

    /**
     * Gets project associated with the plot
     * @return Project
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * Sets project associated with the plot
     * @param project Project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * Gets editors editing the plot
     * @return ArrayList of editor objects
     */
    public ArrayList<Editor> getEditors() {
        return this.editors;
    }

    /**
     * Sets editors editing the plot
     * @param editors ArrayList of editor objects
     */
    public void setEditors(ArrayList<Editor> editors) {
        this.editors = editors;
        initialise();
    }

    /**
     * Gets visualisations of the plot
     * @return ArrayList of visualisation objects
     */
    public ArrayList<Visualisation> getVisualisations() {
        return this.visualisations;
    }

    /**
     * Sets visualisations of the plot
     * @param visualisations ArrayList of visualisation objects
     */
    public void setVisualisations(ArrayList<Visualisation> visualisations) {
        this.visualisations = visualisations;
        initialise();
    }

    /**
     * Gets chapters of the plot (all versions)
     * @return ArrayList of chapters objects (versions of plot)
     */
    public ArrayList<Chapters> getChapters() {
        return this.chapters;
    }

    /**
     * Sets chapters of the plot
     * @param chapters ArrayList of chapters objects (versions of the plot)
     */
    public void setChapters(ArrayList<Chapters> chapters) {
        this.chapters = chapters;
    }

    /**
     * Gets the version control object managing versions of the plot
     * @return Version Control object managing the plot versions
     */
    public VersionControl getVersionControl() {
        return this.versionControl;
    }

    /**
     * Sets the version control object managing versions of the plot
     * @param versionControl Version control object managing the plot versions
     */
    public void setVersionControl(VersionControl versionControl) {
        this.versionControl = versionControl;
        initialise();
    }
    
    /**
     * This private helper method ensures the bidrirectional accessibility found in the class diagrams 
     * between the plot component and the editor, visualisation and version control components
     */
    private void initialise() {
        //Allow bidirection accessibility
        for(Editor editor : this.editors) {
            editor.setPlot(this);
        }
        for(Visualisation visualisation : this.visualisations) {
            visualisation.setPlot(this);
        }
        this.versionControl.setPlot(this);
    }
    
}