import java.io.*;
public class FileDr1 {
    public static void main(String[] args) throws IOException{
        FileWriter fileWriter=new FileWriter("mycontent.txt");
        fileWriter.write(65);
        fileWriter.write("\n");
        fileWriter.write("Here is some data again");
        fileWriter.write("\n");
        fileWriter.close();

    }
}
