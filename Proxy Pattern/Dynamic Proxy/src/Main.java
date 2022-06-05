/**
 * @author Yu
 * @title: Main
 * @projectName DP
 * @date 2022/5/25 23:56
 */
public class Main {
    public static void main(String[] args) {
        Travel travel = (Travel) new JdkTravelAgency().getInstance(new JdkTravelPerson());
        travel.buyTrainticket();
    }
}
