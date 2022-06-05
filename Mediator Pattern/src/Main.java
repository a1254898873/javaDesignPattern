/**
 * @author Yu
 * @title: Main
 * @projectName MP
 * @date 2022/5/27 22:53
 */
public class Main {
    public static void main(String[] args) {
        AbstractMediator registerCenter = new RegisterCenter();//构建一个中介者对象
        //将每个对象初始化进中介者对象
        ServiceA serviceA = new ServiceA(registerCenter);
        ServiceB serviceB = new ServiceB(registerCenter);

        registerCenter.setServiceA(serviceA);
        registerCenter.setServiceB(serviceB);

        serviceA.callB();//服务 A 调用服务 B，实际上服务 A 内部是通过中介者调用服务 B，A 和 B 本身并不直接打交道
        System.out.println("--------------------");
        serviceB.callA();
    }
}
