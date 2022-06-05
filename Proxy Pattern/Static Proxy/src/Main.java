/**
 * @author Yu
 * @title: Main
 * @projectName SP
 * @date 2022/5/25 23:09
 */
public class Main {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency(new TravelPerson());
        travelAgency.buyTrainticket();
    }
}
