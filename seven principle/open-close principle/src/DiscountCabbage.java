import java.math.BigDecimal;

/**
 * @author Yu
 * @title: DiscountCabbage
 * @projectName ocp
 * @date 2022/5/25 16:17
 */
public class DiscountCabbage implements IGoods{
    @Override
    public String getName() {
        return "蔬菜";
    }

    @Override
    public BigDecimal getSalePrice() {
        return new BigDecimal(2.11);
    }
}
