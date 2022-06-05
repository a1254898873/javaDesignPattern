/**
 * @author Yu
 * @title: TravelAgency
 * @projectName SP
 * @date 2022/5/25 23:05
 */
public class TravelAgency implements Travel{
    private TravelPerson travelPerson;//被代理对象

    public TravelAgency(TravelPerson travelPerson) {
        this.travelPerson = travelPerson;
    }

    @Override
    public void buyTrainticket() {
        before();
        this.travelPerson.buyTrainticket();//调用被代理对象的原方法
        after();
    }

    private void before() {
        System.out.println("付定金");
    }

    private void after() {
        System.out.println("付尾款");
    }
}
