/**
 * @author Yu
 * @title: WaitDeliverOrderState
 * @projectName SP
 * @date 2022/5/27 22:16
 */
public class WaitDeliverOrderState extends AbstractOrderState {
    public WaitDeliverOrderState(OrderContext orderContext) {
        super(orderContext);
    }

    @Override
    public void payOrder() {//不是待发货状态订单的行为
        System.out.println("你已经付过钱了");
    }

    @Override
    public void deliver() {
        System.out.println("商品已发货并送达目的地");
        this.orderContext.setState(this.orderContext.receiveGoods);//切换状态
    }

    @Override
    public void receiveGoods() {//不是待发货状态订单的行为
        System.out.println("请稍等，商品即将发货");
    }
}
