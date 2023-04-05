package IllustratorComponent;

public class ImageDownload {

    int size;

    //download an image to the client
    public boolean DownloadToClient(CompressedImage ci){

        if(success){
            return true;
        }
        else{
            return false;
        }

    }

    //decompressing the image for the client
    public Image DecompressImage(CompressionMethod cm, CompressedImage ci){

        return decompress(ci, cm);
    }


}
