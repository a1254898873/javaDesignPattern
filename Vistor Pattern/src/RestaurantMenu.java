import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu
 * @title: RestaurantMenu
 * @projectName VP
 * @date 2022/5/27 22:37
 */
public class RestaurantMenu {
    private List<IRecipe> recipeList = new ArrayList<>();//存储菜单中的菜，也就是数据结构中的元素

    public RestaurantMenu(IRecipe recipe) {//初始化菜单，即初始化数据结构
        recipeList.add(recipe);
    }

    public void addRecipe(IRecipe recipe) {//添加一道菜到菜单中，即添加一种数据类型到数据结构中
        recipeList.add(recipe);
    }

    public void display(ICustomer customer) {//展示所有菜单
        for (IRecipe recipe : recipeList) {
            recipe.accept(customer);
        }
    }
}
