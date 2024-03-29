/**
 * @author Yu
 * @title: Main
 * @projectName LOD
 * @date 2022/5/25 17:21
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();//构建Boss实例
        Manager manager = new Manager(new Cabbage());//构建经理实例，经理需要和商品打交道

        //这里老板只需要和经理打交道就行了
        boss.getCabbageSaleRecord(manager);//获得蔬菜售卖机记录
    }
}
