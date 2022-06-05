/**
 * @author Yu
 * @title: UrgentMessage
 * @projectName BP
 * @date 2022/5/27 22:45
 */
public class UrgentMessage extends AbstractBridgeMessage{
    public UrgentMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String content, String toUser) {
        doSomething();//做点紧急消息需要做的事情
        super.sendMessage(content, toUser);//调用桥接者中的方法：发送消息
    }

    private void doSomething() {
        System.out.println("这是紧急消息，请优先发送");
    }
}
