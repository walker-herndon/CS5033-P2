/**
 * Defined within Plot management package
 */
package PlotManagement;

/**
 * Import project details from project management package
 */
import ProjectManagement.Project;

/**
 * import the ArrayList class - Implementation for "*" for classes in UML
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

    public Plot(Project project) {
        this(project, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new VersionControl());
    }

    public Plot(Project project, ArrayList<Editor> editors, ArrayList<Visualisation> visualisations, ArrayList<Chapters> chapters, VersionControl versionControl) {
        this.project = project;
        this.editors = editors;
        this.visualisations = visualisations;
        this.chapters = chapters;
        this.versionControl = versionControl;
        initialise();
    }

    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ArrayList<Editor> getEditors() {
        return this.editors;
    }

    public void setEditors(ArrayList<Editor> editors) {
        this.editors = editors;
        initialise();
    }

    public ArrayList<Visualisation> getVisualisations() {
        return this.visualisations;
    }

    public void setVisualisations(ArrayList<Visualisation> visualisations) {
        this.visualisations = visualisations;
        initialise();
    }

    public ArrayList<Chapters> getChapters() {
        return this.chapters;
    }

    public void setChapters(ArrayList<Chapters> chapters) {
        this.chapters = chapters;
    }

    public VersionControl getVersionControl() {
        return this.versionControl;
    }

    public void setVersionControl(VersionControl versionControl) {
        this.versionControl = versionControl;
        initialise();
    }
    
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