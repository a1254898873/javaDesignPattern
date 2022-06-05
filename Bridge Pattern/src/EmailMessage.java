/**
 * @author Yu
 * @title: EmailMessage
 * @projectName BP
 * @date 2022/5/27 22:42
 */
public class EmailMessage implements IMessage{
    @Override
    public void send(String content, String toUser) {
        System.out.println(String.format("邮件消息->%s：%s",toUser,content));
    }

}
