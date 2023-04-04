package IllustratorComponent;

public class ImageDownload {

    int size;

    public boolean DownloadToClient(Image i){

        if(success){
            return true;
        }
        else{
            return false;
        }

    }

    public Image DecompressImage(CompressionMethod cm, CompressedImage ci){

        return decompress(ci, cm);
    }


}
