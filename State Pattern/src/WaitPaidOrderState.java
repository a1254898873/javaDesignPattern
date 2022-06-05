/**
 * @author Yu
 * @title: WaitPaidOrderState
 * @projectName SP
 * @date 2022/5/27 22:15
 */
public class WaitPaidOrderState extends AbstractOrderState {
    public WaitPaidOrderState(OrderContext orderContext) {
        super(orderContext);
    }

    @Override
    public void payOrder() {//相当于待支付的状态绑定了支付行为
        System.out.println("支付成功");
        this.orderContext.setState(this.orderContext.waitDeliver);//切换状态
    }

    @Override
    public void deliver() {//不是待支付状态订单的行为
        System.out.println("对不起，请先付钱");
    }

    @Override
    public void receiveGoods() {//不是待支付状态订单的行为
        System.out.println("对不起，请先付钱");
    }
}
