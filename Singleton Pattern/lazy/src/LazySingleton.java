/**
 * @author Yu
 * @title: LazySingleton
 * @projectName lazy
 * @date 2022/5/25 18:36
 */
public class LazySingleton {
    private static  LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public synchronized static LazySingleton getInstance(){
        if (null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;

    }
}
