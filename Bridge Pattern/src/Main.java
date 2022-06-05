/**
 * @author Yu
 * @title: Main
 * @projectName BP
 * @date 2022/5/27 22:46
 */
public class Main {
    public static void main(String[] args) {
        IMessage iMessage = new EmailMessage();
        AbstractBridgeMessage abstractBridgeMessage = new UrgentMessage(iMessage);//紧急邮件消息
        abstractBridgeMessage.sendMessage("您好","双子孤狼1号");
        //再来一个普通短信消息
        System.out.println("------------分割线---------------");
        iMessage = new SmsMessage();
        abstractBridgeMessage = new CommonMsg(iMessage);
        abstractBridgeMessage.sendMessage("您好","双子孤狼2号");

        //最后再来一个紧急的站内信
        System.out.println("------------分割线---------------");
        iMessage = new WebMessage();
        abstractBridgeMessage = new UrgentMessage(iMessage);
        abstractBridgeMessage.sendMessage("您好","实验楼的小伙伴");
    }
}
