/**
 * @author Yu
 * @title: TrainTicket
 * @projectName FP
 * @date 2022/6/5 19:36
 */
public class TrainTicket implements ITicket{
    private String from;
    private String to;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void info() {
        System.out.println(from + "->" + to + ":硬座：100元，硬卧：200元");
    }
}
