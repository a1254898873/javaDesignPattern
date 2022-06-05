/**
 * @author Yu
 * @title: ReceiveGoodsOrderState
 * @projectName SP
 * @date 2022/5/27 22:17
 */
public class ReceiveGoodsOrderState extends AbstractOrderState{
    public ReceiveGoodsOrderState(OrderContext orderContext) {
        super(orderContext);
    }

    @Override
    public void payOrder() {//不是待收货状态订单的行为
        System.out.println("您已经付过钱啦，不要重复付钱哦");
    }

    @Override
    public void deliver() {//不是待收货状态订单的行为
        System.out.println("商品已发货并送达，请不要重复发货");
    }

    @Override
    public void receiveGoods() {
        System.out.println("用户已收到商品，此次交易结束");
    }
}
