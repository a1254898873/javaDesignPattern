/**
 * @author Yu
 * @title: SouthFarmFactory
 * @projectName AFP
 * @date 2022/5/25 17:51
 */
public class SouthFarmFactory implements IFactory {
    @Override
    public IApple createApple() {
        return new SouthApple();//南方农场生产南方苹果
    }

    @Override
    public IOrange createOrange() {
        return new SouthOrange();//南方农场生产南方桔子
    }
}
