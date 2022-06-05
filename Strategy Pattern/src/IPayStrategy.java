import java.math.BigDecimal;

/**
 * @author Yu
 * @title: IPayStrategy
 * @projectName SP
 * @date 2022/5/25 18:02
 */
public interface IPayStrategy {
    boolean pay(int money);//支付
    BigDecimal queryBalance();//查询余额
}
