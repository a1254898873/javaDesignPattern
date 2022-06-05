/**
 * @author Yu
 * @title: Main
 * @projectName hungry
 * @date 2022/5/25 18:32
 */
public class Main {
    public static void main(String[] args) {
        HungrySingleton singleton1  = HungrySingleton.getInstance();
        HungrySingleton singleton2  = HungrySingleton.getInstance();
        System.out.println(singleton1 == singleton2);//输出:true
    }
}
