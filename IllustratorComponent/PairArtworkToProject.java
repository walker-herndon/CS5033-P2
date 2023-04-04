package IllustratorComponent;

public class PairArtworkToProject{


    public boolean pair(Project p, Image i){
        
        //user assigning an image they have commissioned to a project they are part of
        try(pairing (i,p)){

            if(pair succsessful){
                return true;
            }
            else{
                return false;
            }

        }

    }




}