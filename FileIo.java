import java.io.File;
import java.io.IOException;
public class FileIo {
    public static void main(String[] args){
        File file = new File("mydata.txt");
        System.out.println(file.exists());
        try {
            file.createNewFile();
        }catch (IOException e){
                  throw new RuntimeException(e);
            }
        System.out.println(file.exists());
    }

}
