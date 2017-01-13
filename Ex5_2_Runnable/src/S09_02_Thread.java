import java.util.*;

/**
 * Created by godjqb on 17-1-7.
 */
public class S09_02_Thread implements Runnable {
    private int pauseTime;
    private String name;

    public S09_02_Thread(int x, String n) {
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
        Thread t1 = new Thread(new S09_02_Thread(1000,"Fast"));
        t1.start();
        Thread t2 = new Thread(new S09_02_Thread(3000,"Slow"));
        t2.start();
    }

}
