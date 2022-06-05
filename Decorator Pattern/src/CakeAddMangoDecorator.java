import java.math.BigDecimal;

/**
 * @author Yu
 * @title: CakeAddMangoDecorator
 * @projectName DP
 * @date 2022/5/26 0:21
 */
public class CakeAddMangoDecorator extends CakeDecorator{

    public CakeAddMangoDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getCakeMsg() {//获取蛋糕信息
        return super.getCakeMsg() + "+1个芒果";//调用父类装饰器方法，再加上自定义的装饰(加1个芒果)
    }

    @Override
    public BigDecimal getPrice() {//获取价格
        return super.getPrice().add(new BigDecimal("10"));//调用父类装饰器方法，再加上自定义的装饰(加10块钱)
    }

}
