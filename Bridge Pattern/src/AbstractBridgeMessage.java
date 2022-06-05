/**
 * @author Yu
 * @title: AbstractBridgeMessage
 * @projectName BP
 * @date 2022/5/27 22:43
 */
public abstract class AbstractBridgeMessage {
    private IMessage iMessage;//持有抽象维度的引用

    public AbstractBridgeMessage(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    public void sendMessage(String content,String toUser){//定义一个和抽象维度类中具有相同功能的方法：发送消息
        this.iMessage.send(content,toUser);//调用抽象维度内方法：发送消息
    }
}
