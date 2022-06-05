/**
 * @author Yu
 * @title: Main
 * @projectName SP
 * @date 2022/5/25 18:03
 */
public class Main {
    public static void main(String[] args) {
        IPayStrategy IPayStrategy = PayEnum.getValue("aliPay");
        IPayStrategy.pay(10);
        IPayStrategy.queryBalance();
    }
}
