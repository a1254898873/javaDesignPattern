/**
 * @author Yu
 * @title: Main
 * @projectName DP
 * @date 2022/5/26 0:25
 */
public class Main {
    public static void main(String[] args) {
        Cake cake = null;
        //普通蛋糕
        cake = new BaseCake();
        System.out.println(cake.getCakeMsg() + ",价格：" + cake.getPrice());
        //加一个芒果
        cake = new CakeAddMangoDecorator(cake);//芒果装饰器
        System.out.println(cake.getCakeMsg() + ",价格：" + cake.getPrice());
        //加一个葡萄
        cake = new CakeAddGrapeDecorator(cake);//葡萄装饰器
        System.out.println(cake.getCakeMsg() + ",价格：" + cake.getPrice());
        //再加一个芒果
        cake = new CakeAddMangoDecorator(cake);//芒果装饰器
        System.out.println(cake.getCakeMsg() + ",价格：" + cake.getPrice());
    }
}
