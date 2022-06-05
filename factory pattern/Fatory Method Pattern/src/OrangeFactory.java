/**
 * @author Yu
 * @title: OrangeFactory
 * @projectName FMP
 * @date 2022/5/25 17:44
 */
public class OrangeFactory implements IFarmFactory{
    @Override
    public IProduct create() {
        return new Orange();//桔子工厂生产桔子
    }
}
