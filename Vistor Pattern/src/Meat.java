/**
 * @author Yu
 * @title: Meat
 * @projectName VP
 * @date 2022/5/27 22:35
 */
public class Meat implements IRecipe{

    @Override
    public void accept(ICustomer customer) {
        customer.visit(this);
    }

    public String getPrice(){//获取价格
        return "88元/份";
    }

}
