/**
 * @author Yu
 * @title: Main
 * @projectName IP
 * @date 2022/6/5 20:28
 */
public class Main {
    public static void main(String[] args) {
        ExpressionContext context = new ExpressionContext("666 + 888 - 777");//注意每个符号间要包含空格
        System.out.println(context.calcuate());//输出计算结果
        context = new ExpressionContext("123 - 456 + 11");
        System.out.println(context.calcuate());//输出计算结果
    }
}
