/**
 * @author Yu
 * @title: Main
 * @projectName SP
 * @date 2022/5/27 22:19
 */
public class Main {

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();//创建订单上下文，默认待支付状态
        orderContext.payOrder();//支付，支付完成之后状态自动切换到待发货
        orderContext.deliver();//发货，发货之后状态自动切换到待收货
        orderContext.receiveGoods();//收货
    }
}
