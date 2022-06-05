/**
 * @author Yu
 * @title: OrderContext
 * @projectName SP
 * @date 2022/5/27 22:14
 */
public class OrderContext {
    AbstractOrderState waitPaid;//待支付状态
    AbstractOrderState waitDeliver;//待发货状态
    AbstractOrderState receiveGoods;//待收货状态

    AbstractOrderState currState;//当前状态

    public OrderContext() {
        this.waitPaid = new WaitPaidOrderState(this);//初始化待支付状态订单
        this.waitDeliver = new WaitDeliverOrderState(this);//初始化待发货状态订单
        this.receiveGoods = new ReceiveGoodsOrderState(this);//初始化待收货状态订单
        currState = waitPaid;//当前状态，默认待支付
    }

    void setState(AbstractOrderState state) {
        this.currState = state;
    }

    public void payOrder() {//支付
        currState.payOrder();
    }


    public void deliver() {//发货
        currState.deliver();
    }

    public void receiveGoods() {//收货
        currState.receiveGoods();
    }
}
