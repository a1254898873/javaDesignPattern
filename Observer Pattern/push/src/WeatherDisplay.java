/**
 * @author Yu
 * @title: WeatherDisplay
 * @projectName OP
 * @date 2022/5/25 18:47
 */
public class WeatherDisplay implements Observer{
    private float temperature;//温度

    public WeatherDisplay(Subject subject) {//注册监听对象
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature) {//当被观察者气温发生变化会调用这个方法，也就等于更新了观察者对象的数据
        this.temperature = temperature;
    }

    public void display(){
        System.out.println("当前最新的温度为：" + temperature);
    }
}
