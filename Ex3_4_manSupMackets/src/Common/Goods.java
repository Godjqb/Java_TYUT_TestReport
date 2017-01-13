package Common;

/**
 * Created by godjqb on 17-1-4.
 */

public class Goods {
    private String name, producer;
    private float price;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void set(String name, String producer, float price, int num) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.num = num;
    }

    public void showMe() {
        System.out.println(name + "\t" + price + "\t" + producer + "\t" + num);
    }

}
