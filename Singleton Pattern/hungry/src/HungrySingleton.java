/**
 * @author Yu
 * @title: HungrySingleton
 * @projectName hungry
 * @date 2022/5/25 18:17
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
