import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Yu
 * @title: JdkTravelAgency
 * @projectName DP
 * @date 2022/5/25 23:15
 */
public class JdkTravelAgency implements InvocationHandler {
    private Object target;//被代理对象，即示例中的 JdkTravelPerson

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);//调用代理对象方法
        after();
        return obj;
    }

    private void before() {
        System.out.println("付定金");
    }

    private void after() {
        System.out.println("付尾款");
    }
}
