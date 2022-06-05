/**
 * @author Yu
 * @title: AbstractService
 * @projectName MP
 * @date 2022/5/27 22:50
 */
public abstract class AbstractService {
    protected AbstractMediator mediator;//这个就是中介者对象，后面会建立这个对象

    public AbstractService(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void doSomething();
}
