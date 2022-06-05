/**
 * @author Yu
 * @title: Main
 * @projectName OP
 * @date 2022/5/25 18:49
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();//天气数据即被观察者
        WeatherDisplay weatherDisplay = new WeatherDisplay(weatherData);//天气展示即观察者
        weatherData.setMessurements(37.2f);//被观察者数据发生变化了，其内部会通知观察者
        weatherDisplay.display();//查看观察者是否获取到了最新温度数据
    }
}
