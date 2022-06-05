/**
 * @author Yu
 * @title: Main
 * @projectName DIP
 * @date 2022/5/25 16:56
 */
public class Main {
    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        superMarket.sale(new Cabbage());//输出：我有蔬菜可以卖
    }
}
