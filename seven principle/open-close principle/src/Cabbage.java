import java.math.BigDecimal;

/**
 * @author Yu
 * @title: Cabbage
 * @projectName ocp
 * @date 2022/5/25 16:14
 */
public class Cabbage implements IGoods {

    @Override
    public String getName() {
        return "蔬菜";
    }

    @Override
    public BigDecimal getSalePrice() {
        return new BigDecimal(3.77);
    }
}
