/**
 * @author Yu
 * @title: ServiceB
 * @projectName MP
 * @date 2022/5/27 22:51
 */
public class ServiceB  extends AbstractService{
    public ServiceB(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void doSomething() {//这个方法是服务 B 自己干的活
        System.out.println("I'm Service B");
    }

    public void callA(){//服务B中需要调用服务A的方法
        this.doSomething();
        System.out.println("调用Service A");//做点自己的事情先，这个可以不用，实际开发中看需求
        mediator.callServiceA();//通过中介者调用服务 A 的方法
    }
}
