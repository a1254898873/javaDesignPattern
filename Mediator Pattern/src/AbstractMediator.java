/**
 * @author Yu
 * @title: AbstractMediator
 * @projectName MP
 * @date 2022/5/27 22:52
 */
public abstract class AbstractMediator {
    protected AbstractService serviceA;//持有服务 A
    protected AbstractService serviceB;//持有服务 B

    public void setServiceA(AbstractService serviceA) {
        this.serviceA = serviceA;
    }

    public void setServiceB(AbstractService serviceB) {
        this.serviceB = serviceB;
    }

    /**
     * 下面这两个方法也一样，一般每个微服务都需要对应一个方法
     **/
    public abstract void callServiceA();//调用服务 A 方法

    public abstract void callServiceB();//调用服务 B 方法
}
