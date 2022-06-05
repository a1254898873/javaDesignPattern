import java.util.Observable;
import java.util.Observer;

/**
 * @author Yu
 * @title: Friends
 * @projectName pull
 * @date 2022/5/25 19:15
 */
public class Friends implements Observer {
    private String name;//看动态的人名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {//获取（空间）被观察者数据
        Trends trends = new Trends();
        if (null != arg && arg instanceof Trends) {
            trends = (Trends) arg;
        }
        System.out.println(this.getName() + "，您好！您收到了来自" + trends.getNickName() +
                "的一条动态【" + trends.getContent() + "】" + "快去点赞吧！");
    }
}
