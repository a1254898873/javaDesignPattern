/**
 * @author Yu
 * @title: SubExpression
 * @projectName IP
 * @date 2022/6/5 20:27
 */
public class SubExpression extends AbstractNonTerminalExpression {
    public SubExpression(IExpression leftExpression, IExpression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int interpret() {//解释器，将左右两个终结符的值相减
        return this.leftExpression.interpret() - this.rightExpression.interpret();
    }

}
