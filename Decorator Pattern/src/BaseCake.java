import java.math.BigDecimal;

/**
 * @author Yu
 * @title: BaseCake
 * @projectName DP
 * @date 2022/5/26 0:08
 */
public class BaseCake extends Cake{

    @Override
    public String getCakeMsg() {//获取蛋糕信息
        return "我是一个8英寸的普通蛋糕";
    }

    @Override
    public BigDecimal getPrice() {//获取蛋糕价格
        return new BigDecimal("68");
    }

}
