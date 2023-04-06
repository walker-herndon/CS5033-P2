package ProjectManagement;

public class ProjectFactory {
    
    public Project createProject() {
        // creates project in database with necessary details
        Project p = new Project();
        return p;
    }

    public boolean deleteProject (Project p) {
        return true;
    }
    
    public file generateMetaData(Project p){
        return p.data   
    }

}
