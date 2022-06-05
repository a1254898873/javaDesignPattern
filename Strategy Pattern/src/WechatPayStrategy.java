import java.math.BigDecimal;

/**
 * @author Yu
 * @title: WechatPayStrategy
 * @projectName SP
 * @date 2022/5/25 18:03
 */
public class WechatPayStrategy implements IPayStrategy{
    @Override
    public boolean pay(int money) {
        System.out.println("微信支付成功");
        return true;
    }

    @Override
    public BigDecimal queryBalance() {
        System.out.println("微信余额10元");
        return new BigDecimal(10);
    }
}
