import java.util.HashMap;
import java.util.Map;

/**
 * @author Yu
 * @title: TicketFactory
 * @projectName FP
 * @date 2022/6/5 19:37
 */
public class TicketFactory {
    private static Map<String, ITicket> CACHE_POOL = new HashMap<>();//缓存对象

    public static ITicket getTicketInfo(String from, String to) {
        String key = from + "->" + to;
        if (TicketFactory.CACHE_POOL.containsKey(key)) {//对象存在缓存
            System.out.println("使用缓存");
            return TicketFactory.CACHE_POOL.get(key);
        }
        //对象不存在缓存则创建一个对象，并加入缓存
        System.out.println("未使用缓存");
        ITicket ticket = new TrainTicket("深圳", "广州");
        CACHE_POOL.put(key, ticket);
        return ticket;
    }

}
