public class ImageUpload {

    String imageType;

    public boolean UploadToServer(Image i){

        if(!CheckCorrupt()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean CheckCorrupt(Image i){

        if(not corrupt){
            return false;
        }
        else{
            return true;
        }

    }

    public CompressedImage CompressImage(CompressionMethod cm, Image i){

        return compress(i, cm);
    }

}
