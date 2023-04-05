package IllustratorComponent;

import java.util.Dictionary;

public class IllustratorProfile {

    String name;
    float rating;
    Dictionary contactDetails;
    boolean visible;
    List<String> reviews;

    //gives the user the option to hide an illustrator if they no longer want to see their profile
    public boolean hideIllustrator(){

        visible = false;
    }

    //allows a user to report an illustrator
    public boolean reportIllustrator(String complaint){

        send complaint

        if(send complete){
            return true;
        }
        else{
            return false;
        }

    }


}
