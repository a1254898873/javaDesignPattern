/**
 * @author Yu
 * @title: AbstractNonTerminalExpression
 * @projectName IP
 * @date 2022/6/5 20:25
 */
public abstract class AbstractNonTerminalExpression implements IExpression {
    protected IExpression leftExpression;//非终结表达式左边表达式，一般为数字
    protected IExpression rightExpression;//非终结表达式右边表达式，一般为数字

    public AbstractNonTerminalExpression(IExpression leftExpression, IExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
