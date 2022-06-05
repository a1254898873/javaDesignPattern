/**
 * @author Yu
 * @title: ServiceA
 * @projectName MP
 * @date 2022/5/27 22:51
 */
public class ServiceA extends AbstractService{

    public ServiceA(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void doSomething() {//这个方法是服务 A 自己干的活
        System.out.println("I'm Service A");
    }

    public void callB(){//服务A中需要调用服务 B 的方法
        this.doSomething();//做点自己的事情先，这个可以不用，实际开发中看需求
        System.out.println("调用Service B");
        mediator.callServiceB();//通过中介者调用服务B的方法
    }

}
