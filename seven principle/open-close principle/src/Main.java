/**
 * @author Yu
 * @title: Main
 * @projectName ocp
 * @date 2022/5/25 16:19
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("蔬菜原价：" + new Cabbage().getSalePrice());//获取蔬菜原价
        System.out.println("蔬菜打折价：" + new DiscountCabbage().getSalePrice());//获取蔬菜打折价
    }
}
