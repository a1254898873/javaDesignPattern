import java.util.Observable;

/**
 * @author Yu
 * @title: Zone
 * @projectName pull
 * @date 2022/5/25 19:13
 */
public class Zone extends Observable {
    //发表动态
    public void publishTrends(Trends trends) {
        System.out.println(trends.getNickName() + "发表了一个动态【" + trends.getContent() + "】");
        setChanged();//占位,只是设置一个标记说明数据改变了
        notifyObservers(trends);//通知所有观察者
    }
}
