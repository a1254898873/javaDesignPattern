import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu
 * @title: WeatherData
 * @projectName OP
 * @date 2022/5/25 18:44
 */
public class WeatherData implements Subject {
    private List<Observer> observers;//观察者不止一个，所以用list进行维护

    private float temperature;//温度

    public void setMessurements(float temperature){
        this.temperature = temperature;

        notifyObservers();//气温信息发生变化时，通知所有观察者
    }

    public WeatherData() {//初始化list
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){//遍历所有观察者
            observer.update(temperature);//通知观察者更新数据信息
        }
    }
}
