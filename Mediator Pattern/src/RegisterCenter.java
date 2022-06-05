/**
 * @author Yu
 * @title: RegisterCenter
 * @projectName MP
 * @date 2022/5/27 22:52
 */
public class RegisterCenter extends AbstractMediator{

    @Override
    public void callServiceA() {//调用服务 A
        super.serviceA.doSomething();

    }

    @Override
    public void callServiceB() {//调用服务 B
        super.serviceB.doSomething();
    }

}
