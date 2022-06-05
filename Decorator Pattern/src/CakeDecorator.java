import java.math.BigDecimal;

/**
 * @author Yu
 * @title: CakeDecorator
 * @projectName DP
 * @date 2022/5/26 0:15
 */
public abstract class CakeDecorator extends Cake {
    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getCakeMsg() {//获取蛋糕的信息
        return this.cake.getCakeMsg();//调用被装饰的对象原生方法
    }

    @Override
    public BigDecimal getPrice() {//获取蛋糕价格
        return this.cake.getPrice();//调用被装饰的对象原生方法
    }
}
