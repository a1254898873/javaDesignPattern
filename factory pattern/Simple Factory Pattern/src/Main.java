/**
 * @author Yu
 * @title: Main
 * @projectName simple
 * @date 2022/5/25 17:30
 */
public class Main {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        IProduct apple = factory.createProduct("apple");
        apple.grow();//输出：种植苹果

        IProduct orange = factory.createProduct("orange");
        orange.grow();//输出：种植桔子
    }
}
