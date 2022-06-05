/**
 * @author Yu
 * @title: Main
 * @projectName FP
 * @date 2022/6/5 19:42
 */
public class Main {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.getTicketInfo("深圳","广州");
        ticket.info();//首次创建对象
        ticket = TicketFactory.getTicketInfo("深圳","广州");
        ticket.info();//使用缓存
        ticket = TicketFactory.getTicketInfo("深圳","北京");
        ticket.info();//换了目的地，无法使用缓存
    }
}
