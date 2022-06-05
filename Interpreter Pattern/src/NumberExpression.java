/**
 * @author Yu
 * @title: NumberExpression
 * @projectName IP
 * @date 2022/6/5 20:27
 */
public class NumberExpression implements IExpression {

    private int value;//终结表达式的值

    public NumberExpression(String value) {
        this.value = Integer.valueOf(value);
    }

    @Override
    public int interpret() {//解释非终结表达式
        return this.value;//直接返回值就行了
    }

}
