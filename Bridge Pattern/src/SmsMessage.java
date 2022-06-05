/**
 * @author Yu
 * @title: SmsMessage
 * @projectName BP
 * @date 2022/5/27 22:42
 */
public class SmsMessage implements IMessage{
    @Override
    public void send(String content, String toUser) {
        System.out.println(String.format("SMS消息->%s：%s",toUser,content));
    }
}
