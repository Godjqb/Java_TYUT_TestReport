import java.io.*;
import java.util.*;

/**
 * Created by godjqb on 17-1-8.
 */
public class Ex7_5_primeIn {
    public static void main(String args[]) throws IOException {
        List list = new ArrayList();
        for (int i = 2; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }

        FileWriter fw = new FileWriter("fileIn");
        for (int i = 0; i < list.size(); i++) {
            fw.write(list.get(i) + "\n");
        }
        fw.close();
    }
}

