import java.io.File;

/**
 * Created by godjqb on 17-1-8.
 */
public class Exa7_2_getFile {
    public static void main(String args[]) {
        File file = new File("test");
        System.out.println("FileName: " + file.getName());
        System.out.println("FileAbsolutePath: " + file.getAbsolutePath());
        System.out.println("FileLength: " + file.length() + " byte");
    }
}
