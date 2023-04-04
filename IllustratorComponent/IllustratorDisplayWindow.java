package IllustratorComponent;

import java.util.List;

public class IllustratorDisplayWindow {


    Resolution size;
    int numberOfIllustrators;
    List<IllustratorProfile> IllustratorProfiles = new List<IllustratorProfile>();

    public List<IllustratorProfile> DisplayIllustrators(){

        return IllustratorProfiles;
    }

    public IllustratorProfile SelectIllustrator((clickButton) IllustratorProfile ip){

        return IllustratorProfiles.get(ip);
    }


    public List<IllustratorProfile> SortIllustrators(){



    }


}
