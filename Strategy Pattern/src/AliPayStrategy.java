import java.math.BigDecimal;

/**
 * @author Yu
 * @title: AliPayStrategy
 * @projectName SP
 * @date 2022/5/25 18:02
 */
public class AliPayStrategy implements IPayStrategy{
    @Override
    public boolean pay(int money) {
        System.out.println("支付宝支付成功");
        return true;
    }

    @Override
    public BigDecimal queryBalance() {
        System.out.println("支付宝余额20元");
        return new BigDecimal("20");
    }
}
