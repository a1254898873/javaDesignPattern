/**
 * @author Yu
 * @title: Goods
 * @projectName SRP
 * @date 2022/5/25 17:00
 */
public class Goods {
    public void action(String type) {
        if ("进货".equals(type)) {
            System.out.println("我要去进货了");
        } else if ("售卖".equals(type)) {
            System.out.println("我要卖商品");
        }
    }
}
