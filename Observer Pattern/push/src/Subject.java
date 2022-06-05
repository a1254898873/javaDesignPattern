/**
 * @author Yu
 * @title: Subject
 * @projectName OP
 * @date 2022/5/25 18:44
 */
public interface Subject {
    void registerObserver(Observer o);//注册观察对象
    void removeObserver(Observer o);//移除观察对象
    void notifyObservers();//通知观察对象
}
