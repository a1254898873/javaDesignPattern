/**
 * @author Yu
 * @title: CommonMsg
 * @projectName BP
 * @date 2022/5/27 22:45
 */
public class CommonMsg extends AbstractBridgeMessage{

    public CommonMsg(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String content, String toUser) {
        this.doSomething();//做一点普通消息该做的事
        super.sendMessage(content, toUser);//调用桥接者中的方法：发送消息
    }

    private void doSomething() {
        System.out.println("我只是一个普通消息，什么都不用做");
    }

}
