package IllustratorComponent;

public class ImageUpload {

    String imageType;

    //upload image to server
    public boolean UploadToServer(Image i){

        if(!CheckCorrupt()){
            return true;
        }
        else{
            return false;
        }
    }

    //checking the image file is not corrupt
    public boolean CheckCorrupt(Image i){

        if(not corrupt){
            return false;
        }
        else{
            return true;
        }

    }

    //compressing the image with a compression method
    public CompressedImage CompressImage(CompressionMethod cm, Image i){

        return compress(i, cm);
    }

}
