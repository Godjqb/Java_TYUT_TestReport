import java.io.*;

/**
 * Created by godjqb on 17-1-8.
 */
public class Ex7_3_javaIO {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("fileout");
        char array[] = new char[50];
        int value, i = 0;
        while ((value = fr.read()) != -1) {
            array[i] = (char)value;
            i++;
        }
        fr.close();
        FileWriter fw = new FileWriter("filein");
        for (i = 0; i < array.length; i++) {
            fw.write(array[i]);
        }
        fw.close();
    }
}
