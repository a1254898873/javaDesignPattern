/**
 * @author Yu
 * @title: Main
 * @projectName LSP
 * @date 2022/5/25 16:27
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();//输出：我正在天上飞

        Eagle eagle = new Eagle(); //替换成子类Eagle，子类重写了父类Bird的fly方法
        eagle.fly();//输出：我正在8000米高空飞翔
    }
}
