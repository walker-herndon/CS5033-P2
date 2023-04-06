package ProjectManagement;

import PlotManagement.Plot;
import UserComponent.User;

public class Project {
    int id; 
    String title; 
    Image illutrations; 
    String illustrationDescription; 
    Permissions permissions;  
    User creator; 
    Plot plot; 
    
    data = [title, illustrations, creator, plot]
    
    public boolean setTitle(String t) {
        this.title = t; 
        // handles logic to update title in database
        return true; 
    }

    public String getTitle() {
        return "";
    }

    public boolean setIllustration(Image i) {
        return true; 
    }

    public Image getIllustration() {
        Image i = new Image(); 
        // gets illustrations for project
        return i; 
    }
}
