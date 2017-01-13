import java.io.*;

/**
 * Created by godjqb on 17-1-8.
 */
public class Ex7_4_FileCompare {
    public static void main(String args[]) throws IOException {
        FileReader fr1 = new FileReader("fr1");
        FileReader fr2 = new FileReader("fr2");

        boolean tof = true;
        int fr1c, fr2c;
        while (tof) {
            fr1c = fr1.read();
            fr2c = fr2.read();
            if (fr1c != -1 && fr2c != -1){
                if (fr1c != fr2c) {
                    tof = false;
                }
            } else if (fr1c != -1) {
                tof = false;
            } else if (fr2c != -1) {
                tof = false;
            } else {
                break;
            }
        }

        if(tof) {
            System.out.print("Same");
        } else {
            System.out.print("Different");
        }

    }
}
