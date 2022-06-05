/**
 * @author Yu
 * @title: Main
 * @projectName pull
 * @date 2022/5/25 19:17
 */
public class Main {
    public static void main(String[] args) {
        Zone zone = new Zone();
        Friends friends = new Friends();//观察者，即查看好友动态的人
        friends.setName("张三丰");

        Trends trends = new Trends();//被观察者，即发送动态的人
        trends.setNickName("张无忌");
        trends.setContent("祝太师傅长命百岁！");
        zone.addObserver(friends);//注册观察者
        zone.publishTrends(trends);//发布动态
    }
}
