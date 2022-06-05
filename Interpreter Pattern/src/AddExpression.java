/**
 * @author Yu
 * @title: AddExpression
 * @projectName IP
 * @date 2022/6/5 20:26
 */
public class AddExpression extends AbstractNonTerminalExpression {

    public AddExpression(IExpression leftExpression, IExpression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int interpret() {//解释器，将左右两个终结符的值相加
        return this.leftExpression.interpret() + this.rightExpression.interpret();
    }

}
