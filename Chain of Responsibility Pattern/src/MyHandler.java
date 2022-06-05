/**
 * @author Yu
 * @title: MyHandler
 * @projectName CRP
 * @date 2022/5/26 18:00
 */
public abstract class MyHandler {
    protected MyHandler next;//持有下一个节点对象，也就是每个节点都需要知道自己的下一个节点是谁才能传递下去

    public void next(MyHandler handler){
        this.next = handler;
    }

    public abstract void doHandler(LoginUser loginUser);//执行每个节点的处理逻辑
}
