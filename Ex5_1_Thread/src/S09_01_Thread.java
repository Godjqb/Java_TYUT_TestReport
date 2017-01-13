import java.util.*;

/**
 * Created by godjqb on 17-1-7.
 */
public class S09_01_Thread extends Thread {
    private int pauseTime;
    private String name;

    private S09_01_Thread(int x, String n) {
        pauseTime = x;
        name = n;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(name + ":" + new Date(System.currentTimeMillis()));
                Thread.sleep(pauseTime);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        S09_01_Thread tp1 = new S09_01_Thread(1000,"Fast");
        tp1.start();
        S09_01_Thread tp2 = new S09_01_Thread(3000,"Slow");
        tp2.start();
    }

}
