package ProjectManagement;

import PlotManagement.Plot;
import UserComponent.User;

public class Project {
    int id; 
    String title; 
    Illustration illutrations; 
    String illustrationDescription; 
    Permissions permissions;  
    User creator; 
    Plot plot; 
    
    public boolean setTitle(String t) {
        this.title = t; 
        // handles logic to update title in database
        return true; 
    }

    public String getTitle() {
        return "";
    }

    public boolean setIllustration(Illustration i) {
        return true; 
    }

    public Illustration getIllustration() {
        Illustration i = new Illustration(); 
        // gets illustrations for project
        return i; 
    }
}
