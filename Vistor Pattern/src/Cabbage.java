/**
 * @author Yu
 * @title: Cabbage
 * @projectName VP
 * @date 2022/5/27 22:36
 */
public class Cabbage implements IRecipe{
    @Override
    public void accept(ICustomer customer) {
        customer.visit(this);
    }

    public String getPrice(){//获取价格
        return "44元/份";
    }
}
