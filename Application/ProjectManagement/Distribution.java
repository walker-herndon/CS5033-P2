package ProjectManagement;

import PublisherApis;

public class Distribution {
    
    //lists potential publishers from the APIs available
    public List listPublishers(){
        return PublisherApis.listPublishers;
    }    

    public File export(Project p, Format f) {
        // export project to desktop of client
        create new File(p, f)
        return File;
    }

    public boolean sendPublisher(Project p, Publisher pub) {
        // api call to send to selected publisher
        pubAPI = PublisherApis.selectAPI(pub)
        try{
            send(p, pubAPI)
        }
        if(success){
            return true;
        }
        else{
            trigger(API failing warning)
            return false;   
        }    
    }
    
}
