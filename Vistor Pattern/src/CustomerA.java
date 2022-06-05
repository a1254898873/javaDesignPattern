/**
 * @author Yu
 * @title: CustomerA
 * @projectName VP
 * @date 2022/5/27 22:36
 */
public class CustomerA implements ICustomer{

    @Override
    public void visit(Meat meat) {
        System.out.println("肉类：" + meat.getPrice());
    }

    @Override
    public void visit(Cabbage cabbage) {
        System.out.println("时蔬：" + cabbage.getPrice());
    }

}
