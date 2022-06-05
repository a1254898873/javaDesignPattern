import java.util.Stack;

/**
 * @author Yu
 * @title: ExpressionContext
 * @projectName IP
 * @date 2022/6/5 20:28
 */
public class ExpressionContext {

    private Stack<IExpression> stack = new Stack<>();//定义一个栈，计算一般都用栈，利用其后入先出的特性

    public ExpressionContext(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        String[] elementArr = expression.split(" ");//为了简单，直接以空格来切割，所以测试的时候每个数字和符号之间都要有空格
        for (int i = 0; i < elementArr.length; i++) {
            String element = elementArr[i];
            if (element.equals("+")) {//加法
                IExpression leftExpression = stack.pop();//栈内元素出栈
                IExpression rightExpression = new NumberExpression(elementArr[++i]);//取出+号后的下一个元素
                IExpression addExpression = new AddExpression(leftExpression, rightExpression);
                stack.push(new NumberExpression(addExpression.interpret() + ""));//将计算结果入栈
            } else if (element.equals("-")) {//减法
                IExpression leftExpression = stack.pop();//栈内元素出栈
                IExpression rightExpression = new NumberExpression(elementArr[++i]);//取出-号后的下一个元素
                IExpression subExpression = new SubExpression(leftExpression, rightExpression);
                stack.push(new NumberExpression(subExpression.interpret() + ""));//将计算结果入栈
            } else {
                stack.push(new NumberExpression(element));//如果是数字则直接入栈
            }
        }
    }

    public int calcuate() {//运算结果
        return stack.pop().interpret();//经过前面解析，到这里stack内只会剩下唯一一个数字，即运算结果
    }

}
