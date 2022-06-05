/**
 * @author Yu
 * @title: PayEnum
 * @projectName SP
 * @date 2022/5/25 18:04
 */
public enum PayEnum {
    AliPay("aliPay",new AliPayStrategy()),
    WechatPay("wechatPay",new WechatPayStrategy());

    private String key;
    private IPayStrategy value;

    PayEnum(String key, IPayStrategy value) {
        this.key = key;
        this.value = value;
    }

    public static IPayStrategy getValue(String key){
        for (PayEnum payEnum : PayEnum.values()){
            if (payEnum.key.equals(key)){
                return payEnum.value;
            }
        }
        return new AliPayStrategy();
    }
}
