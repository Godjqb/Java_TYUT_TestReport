import java.util.Date;

/**
 * Created by godjqb on 17-1-7.
 */
public class Ex5_3_ThreeThread extends Thread {
    private String name;

    public Ex5_3_ThreeThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + new Date(System.currentTimeMillis()));
    }

    public static void main(String args[]) {
        Ex5_3_ThreeThread t1 = new Ex5_3_ThreeThread("t1");
        t1.start();
        Ex5_3_ThreeThread t2 = new Ex5_3_ThreeThread("t2");
        t2.start();
        Ex5_3_ThreeThread t3 = new Ex5_3_ThreeThread("t3");
        t3.start();
    }

}
