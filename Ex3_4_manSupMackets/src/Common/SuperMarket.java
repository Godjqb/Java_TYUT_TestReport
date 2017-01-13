package Common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by godjqb on 17-1-4.
 */
public class SuperMarket {
    private List<Goods> goodsList = new ArrayList<Goods>();

    public void append(Goods goods) {
        goodsList.add(goods);
    }

    public void add(String name, String producer, float price, int num) {
        Goods goods = new Goods();
        goods.set(name,producer,price,num);
        goodsList.add(goods);
    }

    public void delete(String name) {
        if (name != null) {
            for (int i =0; i < goodsList.size(); i++) {
                Goods goods = goodsList.get(i);
                if (goods.getName().equals(name)) {
                    goodsList.remove(i);
                    break;
                }
            }
        }
    }

    public void sale(Goods goods) {
        if (goods != null) {
            for (int i = 0; i < goodsList.size(); i++) {
                Goods goods_2 = goodsList.get(i);
                if (goods.getName().equals(goods_2.getName())) {
                    if (goods.getNum() > goods_2.getNum()) {
                        System.out.println("库存不足");
                    } else {
                        goodsList.get(i).setNum(goods_2.getNum() - goods.getNum());
                    }
                }
            }
        }
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void check() {
        for (int i = 0; i < goodsList.size(); i++) {
            System.out.println("Name:" + goodsList.get(i).getName() + " Producer:" +
                    goodsList.get(i).getProducer() + " price:￥" + goodsList.get(i).getPrice() +
                    " Num:" + goodsList.get(i).getNum());
        }
    }

    public void query(String name, String producer) {
        if (name != null && producer != null) {
            for (int i = 0; i < goodsList.size(); i++) {
                if(goodsList.get(i).getName().equals(name)) {
                    if(goodsList.get(i).getProducer().equals(producer)){
                        System.out.println("Name:" + goodsList.get(i).getName() + " Producer:" +
                                goodsList.get(i).getProducer() + " price:￥" + goodsList.get(i).getPrice() +
                                " Num:" + goodsList.get(i).getNum());
                        break;
                    }
                }
            }
        }
    }

    public void query(String name) {
        if (name != null) {
            for (int i = 0; i < goodsList.size(); i++) {
                if(goodsList.get(i).getName().equals(name)) {
                    System.out.println("Name:" + goodsList.get(i).getName() + " Producer:" +
                            goodsList.get(i).getProducer() + " price:￥" + goodsList.get(i).getPrice() +
                            " Num:" + goodsList.get(i).getNum());
                }
            }
        }
    }

}
