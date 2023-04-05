package IllustratorComponent;

public class ReviewSystem {

    int numberOfStars;
    String description;

    //post a review of an illustrator
    public void PostReview(String review, int stars){

        post(new Review(review, stars));
    }

    //giving the illustrator the opportunity to dispute a review they are unhappy with
    public boolean disputeReview(){

        if(dispute == successful){
            return true;
        }
        else{
            return false;
        }

    }

}
