public class ReviewSystem {

    int numberOfStars;
    String description;

    public void PostReview(String review, int stars){

        post(new Review(review, stars));
    }


    public boolean disputeReview(){

        if(dispute == successful){
            return true;
        }
        else{
            return false;
        }

    }

}
