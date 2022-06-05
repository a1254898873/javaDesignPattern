/**
 * @author Yu
 * @title: WebMessage
 * @projectName BP
 * @date 2022/5/27 22:43
 */
public class WebMessage implements IMessage{
    @Override
    public void send(String content, String toUser) {
        System.out.println(String.format("站内消息->%s：%s",toUser,content));
    }

}
