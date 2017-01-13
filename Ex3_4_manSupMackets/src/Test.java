import Common.Goods;
import Common.SuperMarket;

/**
 * Created by godjqb on 17-1-4.
 */
public class Test {
    public static void main(String args[]) {
        SuperMarket market = new SuperMarket();
        market.add("cola","usa",3,10);
        market.add("cola","cha",3,10);
        market.add("chip","usa",5,5);
        market.check();
        Goods chip = new Goods();
        chip.set("chip", "usa", 5,5);
        market.sale(chip);
        market.check();
        market.query("cola","usa");
    }
}
