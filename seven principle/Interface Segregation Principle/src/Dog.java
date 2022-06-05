/**
 * @author Yu
 * @title: Dog
 * @projectName ISP
 * @date 2022/5/25 17:11
 */
public class Dog implements IFlyAnimal, ISwimAnimal {
    @Override
    public void run() {
        System.out.println("我跑的很快");
    }

    @Override
    public void swim() {
        System.out.println("我还会游泳");
    }
}
