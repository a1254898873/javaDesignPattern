/**
 * @author Yu
 * @title: IRecipe
 * @projectName VP
 * @date 2022/5/27 22:34
 */
public interface IRecipe {
    void accept(ICustomer customer);//食谱接受访问者顾客的访问，参数就是顾客
}
