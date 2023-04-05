package IllustratorComponent;

import java.util.List;

public class IllustratorDisplayWindow {


    Resolution size;
    int numberOfIllustrators;
    List<IllustratorProfile> IllustratorProfiles = new List<IllustratorProfile>();

    //illustrator list for the display window
    public List<IllustratorProfile> DisplayIllustrators(){

        return IllustratorProfiles;
    }

    //a user clicking on a specific illustrator profile
    public IllustratorProfile SelectIllustrator((clickButton) IllustratorProfile ip){

        return IllustratorProfiles.get(ip);
    }

    //sorts the illustrators based on a filter
    public List<IllustratorProfile> SortIllustrators(Filter f){

        return sorted(illustratorProfiles, f)
    }


}
