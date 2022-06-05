/**
 * @author Yu
 * @title: AppleFactory
 * @projectName FMP
 * @date 2022/5/25 17:43
 */
public class AppleFactory implements IFarmFactory {
    @Override
    public IProduct create() {
        return new Apple();//苹果工厂生产苹果
    }
}
